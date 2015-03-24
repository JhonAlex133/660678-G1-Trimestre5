/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package edu.co.sena.onlineshop.integracion.dao;

import java.util.Date;
import edu.co.sena.onlineshop.integracion.dto.*;
import edu.co.sena.onlineshop.integracion.exceptions.*;

public interface FacturaDao
{
	/** 
	 * Inserts a new row in the factura table.
	 */
	public FacturaPk insert(Factura dto) throws FacturaDaoException;

	/** 
	 * Updates a single row in the factura table.
	 */
	public void update(FacturaPk pk, Factura dto) throws FacturaDaoException;

	/** 
	 * Deletes a single row in the factura table.
	 */
	public void delete(FacturaPk pk) throws FacturaDaoException;

	/** 
	 * Returns the rows from the factura table that matches the specified primary-key value.
	 */
	public Factura findByPrimaryKey(FacturaPk pk) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'ID_FACTURA = :idFactura'.
	 */
	public Factura findByPrimaryKey(int idFactura) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria ''.
	 */
	public Factura[] findAll() throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'CUENTA_NUMERO_DOCUMENTO = :cuentaNumeroDocumento AND CUENTA_TIPO_DOCUMENTO = :cuentaTipoDocumento'.
	 */
	public Factura[] findByCuenta(String cuentaNumeroDocumento, String cuentaTipoDocumento) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'ID_FACTURA = :idFactura'.
	 */
	public Factura[] findWhereIdFacturaEquals(int idFactura) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'FECHA_FACTURA = :fechaFactura'.
	 */
	public Factura[] findWhereFechaFacturaEquals(Date fechaFactura) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'FORMA_PAGO = :formaPago'.
	 */
	public Factura[] findWhereFormaPagoEquals(String formaPago) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'CUENTA_NUMERO_DOCUMENTO = :cuentaNumeroDocumento'.
	 */
	public Factura[] findWhereCuentaNumeroDocumentoEquals(String cuentaNumeroDocumento) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the criteria 'CUENTA_TIPO_DOCUMENTO = :cuentaTipoDocumento'.
	 */
	public Factura[] findWhereCuentaTipoDocumentoEquals(String cuentaTipoDocumento) throws FacturaDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the factura table that match the specified arbitrary SQL statement
	 */
	public Factura[] findByDynamicSelect(String sql, Object[] sqlParams) throws FacturaDaoException;

	/** 
	 * Returns all rows from the factura table that match the specified arbitrary SQL statement
	 */
	public Factura[] findByDynamicWhere(String sql, Object[] sqlParams) throws FacturaDaoException;

}