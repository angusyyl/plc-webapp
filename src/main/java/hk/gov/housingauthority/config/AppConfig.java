package hk.gov.housingauthority.config;

import java.util.Properties;

import org.apache.ibatis.datasource.DataSourceFactory;
import org.apache.ibatis.datasource.pooled.PooledDataSourceFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AppConfig {
	
	@Autowired
	private Environment env;
	
	private Properties dataSourceProperties;
	
	@Bean
	public SqlSessionFactory getSessionFactory() {
		System.out.println("ABC");
		dataSourceProperties = new Properties();
		dataSourceProperties.setProperty("driver", "com.mysql.cj.jdbc.Driver");
		dataSourceProperties.setProperty("url", "jdbc:mysql://localhost:3306/world");
		dataSourceProperties.setProperty("username", "root");
		dataSourceProperties.setProperty("password", "admin");

//		dataSourceProperties.setProperty("DATA_SOURCE", "jdbc/plc01");
		
		DataSourceFactory dataSourceFactory = new PooledDataSourceFactory();
//		DataSourceFactory dataSourceFactory = new JndiDataSourceFactory();
		dataSourceFactory.setProperties(dataSourceProperties);
		TransactionFactory transactionFactory =
		  new JdbcTransactionFactory();
		org.apache.ibatis.mapping.Environment environment =
		  new org.apache.ibatis.mapping.Environment("development", transactionFactory, dataSourceFactory.getDataSource());
		org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration (environment);
		configuration.addMappers("hk.gov.housingauthority.dao");
		SqlSessionFactory sqlSessionFactory =
		  new SqlSessionFactoryBuilder().build(configuration);
		return sqlSessionFactory;
	}
}
