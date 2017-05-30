/**
 */
package de.hub.modsoft.twittersearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Int Operators</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getIntOperators()
 * @model
 * @generated
 */
public enum IntOperators implements Enumerator {
	/**
	 * The '<em><b>Gt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT_VALUE
	 * @generated
	 * @ordered
	 */
	GT(0, "gt", ">"),

	/**
	 * The '<em><b>Gte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GTE_VALUE
	 * @generated
	 * @ordered
	 */
	GTE(1, "gte", ">="),

	/**
	 * The '<em><b>Eq</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EQ_VALUE
	 * @generated
	 * @ordered
	 */
	EQ(2, "eq", "="),

	/**
	 * The '<em><b>Lt</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT_VALUE
	 * @generated
	 * @ordered
	 */
	LT(3, "lt", "<"),

	/**
	 * The '<em><b>Lte</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LTE_VALUE
	 * @generated
	 * @ordered
	 */
	LTE(4, "lte", "<=");

	/**
	 * The '<em><b>Gt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GT
	 * @model name="gt" literal=">"
	 * @generated
	 * @ordered
	 */
	public static final int GT_VALUE = 0;

	/**
	 * The '<em><b>Gte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GTE
	 * @model name="gte" literal=">="
	 * @generated
	 * @ordered
	 */
	public static final int GTE_VALUE = 1;

	/**
	 * The '<em><b>Eq</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eq</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EQ
	 * @model name="eq" literal="="
	 * @generated
	 * @ordered
	 */
	public static final int EQ_VALUE = 2;

	/**
	 * The '<em><b>Lt</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lt</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LT
	 * @model name="lt" literal="<"
	 * @generated
	 * @ordered
	 */
	public static final int LT_VALUE = 3;

	/**
	 * The '<em><b>Lte</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lte</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LTE
	 * @model name="lte" literal="<="
	 * @generated
	 * @ordered
	 */
	public static final int LTE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Int Operators</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IntOperators[] VALUES_ARRAY =
		new IntOperators[] {
			GT,
			GTE,
			EQ,
			LT,
			LTE,
		};

	/**
	 * A public read-only list of all the '<em><b>Int Operators</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IntOperators> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Int Operators</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntOperators get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntOperators result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Int Operators</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntOperators getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntOperators result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Int Operators</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static IntOperators get(int value) {
		switch (value) {
			case GT_VALUE: return GT;
			case GTE_VALUE: return GTE;
			case EQ_VALUE: return EQ;
			case LT_VALUE: return LT;
			case LTE_VALUE: return LTE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private IntOperators(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //IntOperators
