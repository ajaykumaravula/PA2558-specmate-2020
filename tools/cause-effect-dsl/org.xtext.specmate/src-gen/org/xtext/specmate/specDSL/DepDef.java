/**
 * generated by Xtext 2.17.1
 */
package org.xtext.specmate.specDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dep Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.specmate.specDSL.DepDef#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.specmate.specDSL.DepDef#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see org.xtext.specmate.specDSL.SpecDSLPackage#getDepDef()
 * @model
 * @generated
 */
public interface DepDef extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.specmate.specDSL.SpecDSLPackage#getDepDef_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.specmate.specDSL.DepDef#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.specmate.specDSL.DepTag}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Tags</em>' containment reference list.
   * @see org.xtext.specmate.specDSL.SpecDSLPackage#getDepDef_Tags()
   * @model containment="true"
   * @generated
   */
  EList<DepTag> getTags();

} // DepDef
