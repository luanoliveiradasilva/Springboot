package br.com.springBoot.awesome.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import br.com.springBoot.awesome.model.Student;

/**
 * 
 * @author elenj
 * @implNote Sempre que quiser executar uma classe
 *           utiliza-se @Componente, @Service ou @Repository.
 *
 */
@Component
public class DateUtil {

	public String formatLocalDateTimeDatabaseStyle(LocalDateTime localDateTime) {
		return DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDateTime);
	}
}
