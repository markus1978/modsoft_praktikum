/**
 */
package de.hub.modsoft.twittersearch.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Distance Unit</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.hub.modsoft.twittersearch.model.TwitterSearchPackage#getDistanceUnit()
 * @model
 * @generated
 */
public enum DistanceUnit implements Enumerator {
	/**
	 * The '<em><b>Miles</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MILES_VALUE
	 * @generated
	 * @ordered
	 */
	MILES(0, "miles", "miles"),

	/**
	 * The '<em><b>Kilometers</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KILOMETERS_VALUE
	 * @generated
	 * @ordered
	 */
	KILOMETERS(1, "kilometers", "kilometers");

	/**
	 * The '<em><b>Miles</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Miles</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MILES
	 * @model name="miles"
	 * @generated
	 * @ordered
	 */
	public static final int MILES_VALUE = 0;

	/**
	 * The '<em><b>Kilometers</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Kilometers</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KILOMETERS
	 * @model name="kilometers"
	 * @generated
	 * @ordered
	 */
	public static final int KILOMETERS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Distance Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DistanceUnit[] VALUES_ARRAY =
		new DistanceUnit[] {
			MILES,
			KILOMETERS,
		};

	/**
	 * A public read-only list of all the '<em><b>Distance Unit</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DistanceUnit> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Distance Unit</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DistanceUnit get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DistanceUnit result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Distance Unit</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DistanceUnit getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DistanceUnit result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Distance Unit</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DistanceUnit get(int value) {
		switch (value) {
			case MILES_VALUE: return MILES;
			case KILOMETERS_VALUE: return KILOMETERS;
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
	private DistanceUnit(int value, String name, String literal) {
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
	
} //DistanceUnit
