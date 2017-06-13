package com.news.Dao;

import java.util.List;

import com.news.entity.Manager;

/**
 * Manager���Dao��ӿ�
 * 
 * @author xnlo
 * @version 1.0
 */
public interface ManagerDao {
	
	/**
	 * ��¼����
	 * �����û�������������ж�
	 * 
	 * @param name �û����û���
	 * @param pwd  �û�����
	 * @return ��¼�ɹ�����true ��¼ʧ�ܷ���false
	 */
	boolean login(String name,String pwd);
	
	/**
	 * ����id��ѯ��¼
	 * 
	 * @param ���ݵ�id����
	 * @return ����id��ѯ����Manager����
	 */
	Manager findbyid(int id);
	
	/**
	 * ���Ӽ�¼
	 * 
	 * @param manager Ҫ���ӵ�Manager��
	 * @return �����ɹ�����true������ʧ�ܷ���false
	 */
	boolean add(Manager manager);
	
	/**
	 * ��������
	 * 
	 * @param manager �����޸ĺ����ݵ�Manager��
	 * @return �����ɹ�����true������ʧ�ܷ���false
	 */
	boolean update(Manager manager);
	
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
	List<Manager> findall();
	
	/**
	 * ���ӻ��޸�����
	 * Manager���а���idֵ�����޸Ĳ���
	 * ������idֵ�������Ӳ���
	 * 
	 * @param manager ������ӻ��޸ĵ����ݵ�Manager��
	 * @return �����ɹ�����true������ʧ�ܷ���false
	 */
	boolean addorupdate(Manager manager);

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
	List<Manager> findLimit(int begin, int pageSize);

	Manager findbyname(Manager manager);
	
}
