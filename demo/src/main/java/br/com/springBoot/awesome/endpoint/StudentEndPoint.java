package br.com.springBoot.awesome.endpoint;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.springBoot.awesome.util.DateUtil;

@RestController
@RequestMapping("student")
public class StudentEndPoint {

	@Autowired
	private DateUtil dateUtil;
	
	@RequestMapping(method = RequestMethod.GET, path = "/list")
	public List<String> listAll() {
		System.out.println("-------------: "+dateUtil.formatLocalDateTimeDatabaseStyle(LocalDateTime.now())+" :-------------");
		
		String a[] = new String[] { "Luan", "Tiago", "Pedro" };

		List<String> list = Arrays.asList(a);

		return list;
	}

}
