/**
 * generated by Xtext 2.13.0
 */
package org.xtext.hlcl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.hlcl.HlclPackage
 * @generated
 */
public interface HlclFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HlclFactory eINSTANCE = org.xtext.hlcl.impl.HlclFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Constraint Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constraint Program</em>'.
   * @generated
   */
  ConstraintProgram createConstraintProgram();

  /**
   * Returns a new object of class '<em>Variables</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variables</em>'.
   * @generated
   */
  Variables createVariables();

  /**
   * Returns a new object of class '<em>Dom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dom</em>'.
   * @generated
   */
  Dom createDom();

  /**
   * Returns a new object of class '<em>Range Dom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Dom</em>'.
   * @generated
   */
  RangeDom createRangeDom();

  /**
   * Returns a new object of class '<em>Set Dom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Dom</em>'.
   * @generated
   */
  SetDom createSetDom();

  /**
   * Returns a new object of class '<em>Bool Dom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Dom</em>'.
   * @generated
   */
  BoolDom createBoolDom();

  /**
   * Returns a new object of class '<em>String Dom</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Dom</em>'.
   * @generated
   */
  StringDom createStringDom();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  HlclPackage getHlclPackage();

} //HlclFactory
