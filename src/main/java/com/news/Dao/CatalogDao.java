package com.news.Dao;

import java.util.List;

import com.news.entity.Catalog;

/**
 * Catalog���Dao��ӿ�
 * 
 * @author xnlo
 * @version 1.0
 */
public interface CatalogDao {
	
	/**
	 * ����id��ѯ��¼
	 * 
	 * @param ���ݵ�id����
	 * @return ����id��ѯ����Manager����
	 */
	Catalog findbyid(int id);
	
	/**
	 * ���Ӽ�¼
	 * 
	 * @param manager Ҫ���ӵ�Manager��
	 * @return �����ɹ�����true������ʧ�ܷ���false
	 */
	boolean add(Catalog catalog);
	
	/**
	 * ��������
	 * 
	 * @param manager �����޸ĺ����ݵ�Manager��
	 * @return �����ɹ�����true������ʧ�ܷ���false
	 */
	boolean update(Catalog catalog);
	
	/**
	 * ɾ������
	 * 
	 * @param id
	 * @return �����ɹ�����true������ʧ�ܷ���false
	 */
	boolean delete(int id);
	
	/**
	 * ��ѯȫ������
	 * 
	 * @return ���м�¼��list����
	 */
	List<Catalog> findall();
	
	/**
	 * ���ӻ��޸�����
	 * Manager���а���idֵ�����޸Ĳ���
	 * ������idֵ�������Ӳ���
	 * 
	 * @param manager ������ӻ��޸ĵ����ݵ�Manager��
	 * @return �����ɹ�����true������ʧ�ܷ���false
	 */
	boolean addorupdate(Catalog catalog);

	/**
	 * ��ѯ�ܼ�¼��
	 * 
	 * @return �����ݱ��ȫ����¼��
	 */
	int findCount();

	/**
	 * ���з�ҳ�����Ĳ�ѯȫ����¼
	 * 
	 * @param pageSize ÿҳ�ļ�¼��
	 * @param begin ��ҳ�Ŀ�ʼλ��
	 * @return ��ҳ�����ݵ�list����
	 */
	List<Catalog> findLimit(int begin, int pageSize);
	
}
