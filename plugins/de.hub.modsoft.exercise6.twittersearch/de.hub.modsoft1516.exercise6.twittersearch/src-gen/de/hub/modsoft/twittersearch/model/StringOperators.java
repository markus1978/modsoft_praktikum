/**
 */
package de.hub.modsoft.twittersearch.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>String Operators</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getStringOperators()
 * @model
 * @generated
 */
public enum StringOperators implements Enumerator {
	/**
	 * The '<em><b>Contains</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINS_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINS(0, "contains", "contains"),

	/**
	 * The '<em><b>Containsnot</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINSNOT_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINSNOT(1, "containsnot", "containsnot");

	/**
	 * The '<em><b>Contains</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Contains</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINS
	 * @model name="contains"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINS_VALUE = 0;

	/**
	 * The '<em><b>Containsnot</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Containsnot</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINSNOT
	 * @model name="containsnot"
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINSNOT_VALUE = 1;

	/**
	 * An array of all the '<em><b>String Operators</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StringOperators[] VALUES_ARRAY =
		new StringOperators[] {
			CONTAINS,
			CONTAINSNOT,
		};

	/**
	 * A public read-only list of all the '<em><b>String Operators</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StringOperators> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>String Operators</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StringOperators get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StringOperators result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>String Operators</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StringOperators getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StringOperators result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>String Operators</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static StringOperators get(int value) {
		switch (value) {
			case CONTAINS_VALUE: return CONTAINS;
			case CONTAINSNOT_VALUE: return CONTAINSNOT;
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
	private StringOperators(int value, String name, String literal) {
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
	
} //StringOperators
