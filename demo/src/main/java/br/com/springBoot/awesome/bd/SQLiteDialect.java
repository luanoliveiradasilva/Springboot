package br.com.springBoot.awesome.bd;

import java.sql.Types;

import javax.sql.DataSource;

import org.hibernate.dialect.Dialect;
import org.hibernate.dialect.identity.IdentityColumnSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SQLiteDialect extends Dialect {

	public SQLiteDialect() {
		registerColumnType(Types.BIT, "integer");
		registerColumnType(Types.TINYINT, "tinyint");
		registerColumnType(Types.SMALLINT, "smallint");
		registerColumnType(Types.INTEGER, "integer");
	}

	@Override
	public IdentityColumnSupport getIdentityColumnSupport() {
		return new SQLiteIdentityColumnSupport();
	}

	@Override
	public boolean hasAlterTable() {
		return false;
	}

	@Override
	public boolean dropConstraints() {
		return false;
	}

	@Override
	public String getDropForeignKeyString() {
		return "";
	}

	@Override
	public String getAddForeignKeyConstraintString(String cn, String[] fk, String t, String[] ok, boolean rpk) {
		return "";
	}

	@Override
	public String getAddPrimaryKeyConstraintString(String constraintName) {
		return "";
	}

	@Autowired
	Environment env;

	@Bean
	public DataSource dataSource() {
		final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("driverClassName"));
		dataSource.setUrl(env.getProperty("url"));
		dataSource.setUsername(env.getProperty("username"));
		dataSource.setPassword(env.getProperty("password"));
		return dataSource;
	}

}
