package net.rafaelaznar.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import net.rafaelaznar.bean.TipoproductoBean;
import net.rafaelaznar.data.MysqlData;
import net.rafaelaznar.helper.FilterBean;

/**
 *
 * @author rafa
 */
public class TipoproductoDao {
/*
    private final MysqlData oMysqlData;
    private final net.rafaelaznar.helper.Enum.Connection enumTipoConexion;
    private final String strTabla = "tipoproducto";

    public TipoproductoDao(net.rafaelaznar.helper.Enum.Connection tipoConexion) throws Exception {
        oMysqlData = new MysqlData();
        enumTipoConexion = tipoConexion;
    }

    public int getPages(int intRegsPerPag, ArrayList<FilterBean> alFilter, HashMap<String, String> hmOrder) throws Exception {
        int pages;
        try {
            oMysqlData.conexion(enumTipoConexion);
            pages = oMysqlData.getPages(strTabla, intRegsPerPag, alFilter, hmOrder);
            oMysqlData.desconexion();
            return pages;
        } catch (Exception e) {
            throw new Exception("ProductoDao.getPages: Error: " + e.getMessage());
        } finally {
            oMysqlData.desconexion();
        }
    }

    public int getCount(ArrayList<FilterBean> hmFilter) throws Exception {
        int pages;
        try {
            oMysqlData.conexion(enumTipoConexion);
            pages = oMysqlData.getCount("tipoproducto", hmFilter);
            oMysqlData.desconexion();
            return pages;
        } catch (Exception e) {
            throw new Exception("TipoproductoDao.getCount: Error: " + e.getMessage());
        }
    }

    public ArrayList<TipoproductoBean> getPage(int intRegsPerPag, int intPage, ArrayList<FilterBean> alFilter, HashMap<String, String> hmOrder) throws Exception {
        ArrayList<Integer> alId;
        ArrayList<TipoproductoBean> alBeans = new ArrayList<>();
        try {
            oMysqlData.conexion(enumTipoConexion);
            alId = oMysqlData.getPage(strTabla, intRegsPerPag, intPage, alFilter, hmOrder);
            Iterator<Integer> iterador = alId.listIterator();
            while (iterador.hasNext()) {
                TipoproductoBean oTipoproductoBean = new TipoproductoBean(iterador.next());
                alBeans.add(this.get(oTipoproductoBean));
            }
            oMysqlData.desconexion();
            return alBeans;
        } catch (Exception e) {
            throw new Exception("TiporoductoDao.getPage: Error: " + e.getMessage());
        } finally {
            oMysqlData.desconexion();
        }
    }

    public TipoproductoBean get(TipoproductoBean oTipoproductoBean) throws Exception {
        try {
            oMysqlData.conexion(enumTipoConexion);
            oTipoproductoBean.setDescripcion(oMysqlData.getOne(strTabla, "descripcion", oTipoproductoBean.getId()));
            oMysqlData.desconexion();
        } catch (Exception e) {
            throw new Exception("TiporoductoDao.get: Error: " + e.getMessage());
        } finally {
            oMysqlData.desconexion();
        }
        return oTipoproductoBean;
    }

    public void set(TipoproductoBean oTipoproductoBean) throws Exception {
        try {
            oMysqlData.conexion(enumTipoConexion);
            oMysqlData.initTrans();
            if (oTipoproductoBean.getId() == 0) {
                oTipoproductoBean.setId(oMysqlData.insertOne(strTabla));
            }
            oMysqlData.updateOne(oTipoproductoBean.getId(), strTabla, "descripcion", oTipoproductoBean.getDescripcion());
            oMysqlData.commitTrans();
        } catch (Exception e) {
            oMysqlData.rollbackTrans();
            throw new Exception("TiporoductoDao.set: Error: " + e.getMessage());
        } finally {
            oMysqlData.desconexion();
        }
    }

    public void remove(TipoproductoBean oTipoproductoBean) throws Exception {
        try {
            oMysqlData.conexion(enumTipoConexion);
            oMysqlData.removeOne(oTipoproductoBean.getId(), strTabla);
            oMysqlData.desconexion();
        } catch (Exception e) {
            throw new Exception("TiporoductoDao.remove: Error: " + e.getMessage());
        } finally {
            oMysqlData.desconexion();
        }

    }*/
}
