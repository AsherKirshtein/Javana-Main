package edu.yu.compilers.intermediate.type;

import edu.yu.compilers.intermediate.symtable.Predefined;
import edu.yu.compilers.intermediate.type.Typespec.Form;

import static edu.yu.compilers.intermediate.type.Typespec.Form.ENUMERATION;

import static edu.yu.compilers.intermediate.type.Typespec.Form.SCALAR;

/***
 * This class is responsible for checking the types of expressions and statements.
 * Implement your type system here.
 */
public class TypeChecker {
    /**
     * Check if a type specification is integer.
     *
     * @param type the type specification to check.
     * @return true if integer, else false.
     */
    public static boolean isInteger(Typespec type) {
        return (type != null) && ((type.baseType() == Predefined.integerType) || (type.baseType() == Predefined.integerArrType));
    }

    /**
     * Check if both type specifications are integer.
     *
     * @param type1 the first type specification to check.
     * @param type2 the second type specification to check.
     * @return true if both are integer, else false.
     */
    public static boolean areBothInteger(Typespec type1, Typespec type2) {
        return isInteger(type1) && isInteger(type2);
    }

    /**
     * Check if a type specification is real.
     *
     * @param type the type specification to check.
     * @return true if real, else false.
     */
    public static boolean isReal(Typespec type) {
        return (type != null) && (type.baseType() == Predefined.realType);
    }

    /**
     * Check if a type specification is integer or real.
     *
     * @param type the type specification to check.
     * @return true if integer or real, else false.
     */
    public static boolean isIntegerOrReal(Typespec type) {
        return isInteger(type) || isReal(type);
    }

    /**
     * Check if at least one of two type specifications is real.
     *
     * @param type1 the first type specification to check.
     * @param type2 the second type specification to check.
     * @return true if at least one is real, else false.
     */
    public static boolean isAtLeastOneReal(Typespec type1, Typespec type2) {
        return (isReal(type1) && isReal(type2)) || (isReal(type1) && isInteger(type2)) || (isInteger(type1) && isReal(type2));
    }

    /**
     * Check if a type specification is boolean.
     *
     * @param type the type specification to check.
     * @return true if boolean, else false.
     */
    public static boolean isBoolean(Typespec type) {
        return (type != null) && (type.baseType() == Predefined.booleanType);
    }

    /**
     * Check if both type specifications are boolean.
     *
     * @param type1 the first type specification to check.
     * @param type2 the second type specification to check.
     * @return true if both are boolean, else false.
     */
    public static boolean areBothBoolean(Typespec type1, Typespec type2) {
        return isBoolean(type1) && isBoolean(type2);
    }

    /**
     * Check if a type specification is char.
     *
     * @param type the type specification to check.
     * @return true if the type is not char
     */
    public static boolean isChar(Typespec type) {
        return (type != null) && (type.baseType() == Predefined.charType);
    }

    /**
     * Check if a type specification is string.
     *
     * @param type the type specification to check.
     * @return true if integer, else false.
     */
    public static boolean isString(Typespec type) {
        return (type != null) && (type.baseType() == Predefined.stringType || type.baseType() == Predefined.stringArrType);
    }

    /**
     * Check if both type specifications are string.
     *
     * @param type1 the first type specification to check.
     * @param type2 the second type specification to check.
     * @return true if both are integer, else false.
     */
    public static boolean areBothString(Typespec type1, Typespec type2) {
        return isString(type1) && isString(type2);
    }

    /**
     * Check if two type specifications are assignment compatible.
     *
     * @param targetType the target type specification.
     * @param valueType  the value type specification.
     * @return true if the value can be assigned to the target, else false.
     */
    public static boolean areAssignmentCompatible(Typespec targetType, Typespec valueType) {
        if ((targetType == null) || (valueType == null)) return false;

        targetType = targetType.baseType();
        valueType = valueType.baseType();

        boolean compatible = false;

        // Identical types.
        if (targetType == valueType) return compatible = true;

            // real := integer
        else if (isReal(targetType) && isInteger(valueType)) compatible = true;

        else if(isInteger(targetType) && isInteger(valueType)) return true;

        else if(isString(targetType) && isString(valueType)) return true;

        // array[char] := value
        else if (targetType.getForm() == Typespec.Form.ARRAY && valueType == Predefined.charType) {
            Typespec indexType = targetType.getArrayIndexType().baseType();
            compatible = (indexType == Predefined.charType || (indexType.getForm() == Typespec.Form.SUBRANGE && indexType.getSubrangeBaseType() == Predefined.charType));
        }
        // subrange[char] := char
        else if (targetType.getForm() == Typespec.Form.SUBRANGE && targetType.getSubrangeBaseType() == Predefined.charType && valueType == Predefined.charType) {
            compatible = true; 
        }

        return compatible;
    }

    /**
     * Check if two type specifications are comparison compatible.
     *
     * @param type1 the first type specification to check.
     * @param type2 the second type specification to check.
     * @return true if the types can be compared to each other, else false.
     */
    public static boolean areComparisonCompatible(Typespec type1, Typespec type2) {
        if ((type1 == null) || (type2 == null)) return false;

        type1 = type1.baseType();
        type2 = type2.baseType();
        Form form = type1.getForm();

        boolean compatible = false;

        // Two identical scalar or enumeration types.
        if ((type1 == type2) && ((form == SCALAR) || (form == ENUMERATION))) {
            compatible = true;
        }

        // One integer and one real.
        else if (isAtLeastOneReal(type1, type2)) compatible = true;

        return compatible;
    }
}