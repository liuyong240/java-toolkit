package com.thankjava.toolkit3d.db.mongodb;


import java.util.List;

import org.bson.Document;


/**
 * MogoDB数据层封装工具
* 依赖于 maven[org.mongodb:mongo-java-driver]
* <p>Function: MongoDBManager</p>
* <p>Description: </p>
* @author zhaoxy@thankjava.com
* @date 2016年3月8日 下午5:29:26
* @version 1.0
 */
public interface MongoDBManager {
	
	/**
	 * 统计文档中有多少条数据 docFilter=lnull 则统计全部
	* <p>Function: count</p>
	* <p>Description: </p>
	* @author zhaoxy@thankjava.com
	* @date 2016年3月8日 上午11:36:00
	* @version 1.0
	* @param docName
	* @param docFilter 为null 则统计全部
	* @return
	 */
	public long count(String docName,Document docFilter);
	
	/**
	 * 插入一条数据
	* <p>Function: insertOne</p>
	* <p>Description: </p>
	* @author zhaoxy@thankjava.com
	* @date 2016年3月8日 下午5:27:57
	* @version 1.0
	* @param docName
	* @param doc org.bson.Document
	* @return
	 */
	public boolean insertOne(String docName,Document doc);
	
	/**
	 * 一次性插入批量数据
	* <p>Function: insertMany</p>
	* <p>Description: </p>
	* @author zhaoxy@thankjava.com
	* @date 2016年3月8日 下午5:28:24
	* @version 1.0
	* @param docName
	* @param docs
	* @return
	 */
	public boolean insertMany(String docName,List<Document> docs);
	
	/**
	 * 插入一条数据
	* <p>Function: insertOne</p>
	* <p>Description: </p>
	* @author zhaoxy@thankjava.com
	* @date 2016年3月8日 下午5:28:34
	* @version 1.0
	* @param docName
	* @param t JavaBean
	* @return
	 */
	public boolean insertOne(String docName,Object t);
	
	/**
	 * 一次性插入批量数据
	* <p>Function: insertMany</p>
	* <p>Description: </p>
	* @author zhaoxy@thankjava.com
	* @date 2016年3月8日 下午5:28:53
	* @version 1.0
	* @param docName
	* @param ts
	* @return
	 */
	public boolean insertMany(List<Object> ts,String docName);
	
	/**
	 * 查询一条数据
	* <p>Function: findOne</p>
	* <p>Description: </p>
	* @author zhaoxy@thankjava.com
	* @date 2016年3月30日 上午11:47:51
	* @version 1.0
	* @param docName
	* @param docFilter
	* @return
	 */
	public Document findOne(String docName,Document docFilter);
	
	/**
	 * 查询一条数据
	* <p>Function: findOne</p>
	* <p>Description: </p>
	* @author zhaoxy@thankjava.com
	* @date 2016年3月30日 下午1:48:01
	* @version 1.0
	* @param docName
	* @param t
	* @return
	 */
	public Document findOne(String docName,Object t);
	
	/**
	 * 查询一条数据
	* <p>Function: findOne</p>
	* <p>Description: </p>
	* @author zhaoxy@thankjava.com
	* @date 2016年3月30日 下午1:41:07
	* @version 1.0
	* @param docName
	* @param tFilter
	* @param clazz
	* @return
	 */
	public <T> T findOne(String docName,Object tFilter,Class<T> clazz);
	
	
	/**
	 * 查询一条数据
	* <p>Function: findOne</p>
	* <p>Description: </p>
	* @author zhaoxy@thankjava.com
	* @date 2016年3月30日 下午1:57:43
	* @version 1.0
	* @param docName
	* @param docFilter
	* @param clazz
	* @return
	 */
	public <T> T findOne(String docName,Document docFilter,Class<T> clazz);
	
	/**
	 * 通过docFilter查找数据 返回List<Document> docFilter=null时查询全部
	 * @param docName
	 * @param docFilter
	 * @return
	 */
	public List<Document> findMany(String docName,Document docFilter);
	
	/**
	 * 通过JavaBean(vo)查找数据 返回List<Document> fFilter=null时查询全部
	 * @param docName
	 * @param tFilter
	 * @return
	 */
	public List<Document> findMany(String docName,Object tFilter);
	
	/**
	 * 通过docFilter查找数据 返回List<JavaBean(vo)> docFilter=null时查询全部
	 * @param docName
	 * @param docFilter
	 * @param clazz
	 * @return
	 */
	public <T> List<T> findMany(String docName,Document docFilter,Class<T> clazz);
	
	/**
	 * 通过JavaBean(vo)查找数据 返回List<JavaBean(vo)> fFilter=null时查询全部
	 * @param docName
	 * @param tFilter
	 * @param clazz
	 * @return
	 */
	public <T> List<T> findMany(String docName,Object tFilter,Class<T> clazz);
	
	/**
	 * 找到符合条件的第一条数据(即使有多条也只认为符合的只有一条),并执行更新,当更新的数据!=1返回false
	 * 更新的文档将置于$set属性值中,用于部分节点更新
	 * @param docName
	 * @param doc 更新的文档必须要有实际内容
	 * @param docFilter docFilter=null 更新条件不指定
	 * @return
	 */
	public boolean updateOne(String docName,Document doc,Document docFilter);
	
	/**
	 * 更新多条数据,当找到符合更新条件的数据n条,更新数据y条,当n=0||y=0(或者没有更新任何一条数据)返回false
	 * 更新的文档将置于$set属性值中,用于部分节点更新
	 * @param docName
	 * @param doc 更新的文档必须要有实际内容
	 * @param docFilter
	 * @return
	 */
	public boolean updateMany(String docName, Document doc, Document docFilter);
	
	
	/**
	 * 找到符合条件的第一条数据(即使有多条也只认为符合的只有一条),并执行更新,当更新的数据!=1返回false
	* 更新的文档将置于$set属性值中,用于部分节点更新
	* <p>Function: updateOne</p>
	* <p>Description: </p>
	* @author zhaoxy@thankjava.com
	* @date 2016年9月2日 下午5:31:08
	* @version 1.0
	* @param docName
	* @param t
	* @param tFilter
	* @return
	 */
	public boolean updateOne(String docName,Object t,Object tFilter);
	
	
	/**
	 * 更新多条数据,当找到符合更新条件的数据n条,更新数据y条,当n=0||y=0(或者没有更新任何一条数据)返回false
	* 更新的文档将置于$set属性值中,用于部分节点更新
	* <p>Function: updateMany</p>
	* <p>Description: </p>
	* @author zhaoxy@thankjava.com
	* @date 2016年9月2日 下午5:32:24
	* @version 1.0
	* @param docName
	* @param t
	* @param tFilter
	* @return
	 */
	public boolean updateMany(String docName,Object t,Object tFilter);
	
}
