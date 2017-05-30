/**
 */
package de.hub.modsoft.twittersearch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fields</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.hub.modsoft.twittersearch.TwitterSearchPackage#getFields()
 * @model
 * @generated
 */
public enum Fields implements Enumerator {
	/**
	 * The '<em><b>Favorits</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAVORITS_VALUE
	 * @generated
	 * @ordered
	 */
	FAVORITS(1, "favorits", "favorits"),

	/**
	 * The '<em><b>Retweets</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETWEETS_VALUE
	 * @generated
	 * @ordered
	 */
	RETWEETS(2, "retweets", "retweets"),

	/**
	 * The '<em><b>Mentions</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	MENTIONS(3, "mentions", "mentions"),

	/**
	 * The '<em><b>Has URL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_URL_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_URL(5, "hasURL", "hasURL"),

	/**
	 * The '<em><b>Has Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HAS_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	HAS_IMAGE(6, "hasImage", "hasImage"),

	/**
	 * The '<em><b>Tweets</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TWEETS_VALUE
	 * @generated
	 * @ordered
	 */
	TWEETS(4, "tweets", "tweets"),

	/**
	 * The '<em><b>Follower Count</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOLLOWER_COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	FOLLOWER_COUNT(7, "followerCount", "followerCount");

	/**
	 * The '<em><b>Favorits</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Favorits</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAVORITS
	 * @model name="favorits"
	 * @generated
	 * @ordered
	 */
	public static final int FAVORITS_VALUE = 1;

	/**
	 * The '<em><b>Retweets</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Retweets</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETWEETS
	 * @model name="retweets"
	 * @generated
	 * @ordered
	 */
	public static final int RETWEETS_VALUE = 2;

	/**
	 * The '<em><b>Mentions</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mentions</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENTIONS
	 * @model name="mentions"
	 * @generated
	 * @ordered
	 */
	public static final int MENTIONS_VALUE = 3;

	/**
	 * The '<em><b>Has URL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Has URL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HAS_URL
	 * @model name="hasURL"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_URL_VALUE = 5;

	/**
	 * The '<em><b>Has Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Has Image</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HAS_IMAGE
	 * @model name="hasImage"
	 * @generated
	 * @ordered
	 */
	public static final int HAS_IMAGE_VALUE = 6;

	/**
	 * The '<em><b>Tweets</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tweets</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TWEETS
	 * @model name="tweets"
	 * @generated
	 * @ordered
	 */
	public static final int TWEETS_VALUE = 4;

	/**
	 * The '<em><b>Follower Count</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Follower Count</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOLLOWER_COUNT
	 * @model name="followerCount"
	 * @generated
	 * @ordered
	 */
	public static final int FOLLOWER_COUNT_VALUE = 7;

	/**
	 * An array of all the '<em><b>Fields</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Fields[] VALUES_ARRAY =
		new Fields[] {
			FAVORITS,
			RETWEETS,
			MENTIONS,
			HAS_URL,
			HAS_IMAGE,
			TWEETS,
			FOLLOWER_COUNT,
		};

	/**
	 * A public read-only list of all the '<em><b>Fields</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Fields> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fields</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Fields get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Fields result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fields</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Fields getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Fields result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fields</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Fields get(int value) {
		switch (value) {
			case FAVORITS_VALUE: return FAVORITS;
			case RETWEETS_VALUE: return RETWEETS;
			case MENTIONS_VALUE: return MENTIONS;
			case HAS_URL_VALUE: return HAS_URL;
			case HAS_IMAGE_VALUE: return HAS_IMAGE;
			case TWEETS_VALUE: return TWEETS;
			case FOLLOWER_COUNT_VALUE: return FOLLOWER_COUNT;
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
	private Fields(int value, String name, String literal) {
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
	
} //Fields
