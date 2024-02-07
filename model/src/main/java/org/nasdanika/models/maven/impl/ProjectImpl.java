/**
 */
package org.nasdanika.models.maven.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.nasdanika.models.maven.MavenPackage;
import org.nasdanika.models.maven.Project;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.maven.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ProjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ProjectImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.nasdanika.models.maven.impl.ProjectImpl#getModules <em>Modules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProjectImpl extends CoordinatesImpl implements Project {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MavenPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(MavenPackage.PROJECT__NAME, MavenPackage.Literals.PROJECT__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(MavenPackage.PROJECT__NAME, MavenPackage.Literals.PROJECT__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return (String)eDynamicGet(MavenPackage.PROJECT__DESCRIPTION, MavenPackage.Literals.PROJECT__DESCRIPTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		eDynamicSet(MavenPackage.PROJECT__DESCRIPTION, MavenPackage.Literals.PROJECT__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Project getParent() {
		return (Project)eDynamicGet(MavenPackage.PROJECT__PARENT, MavenPackage.Literals.PROJECT__PARENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project basicGetParent() {
		return (Project)eDynamicGet(MavenPackage.PROJECT__PARENT, MavenPackage.Literals.PROJECT__PARENT, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParent(Project newParent) {
		eDynamicSet(MavenPackage.PROJECT__PARENT, MavenPackage.Literals.PROJECT__PARENT, newParent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Project> getModules() {
		return (EList<Project>)eDynamicGet(MavenPackage.PROJECT__MODULES, MavenPackage.Literals.PROJECT__MODULES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MavenPackage.PROJECT__NAME:
				return getName();
			case MavenPackage.PROJECT__DESCRIPTION:
				return getDescription();
			case MavenPackage.PROJECT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case MavenPackage.PROJECT__MODULES:
				return getModules();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MavenPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case MavenPackage.PROJECT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case MavenPackage.PROJECT__PARENT:
				setParent((Project)newValue);
				return;
			case MavenPackage.PROJECT__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Project>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MavenPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MavenPackage.PROJECT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case MavenPackage.PROJECT__PARENT:
				setParent((Project)null);
				return;
			case MavenPackage.PROJECT__MODULES:
				getModules().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MavenPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case MavenPackage.PROJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case MavenPackage.PROJECT__PARENT:
				return basicGetParent() != null;
			case MavenPackage.PROJECT__MODULES:
				return !getModules().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProjectImpl
