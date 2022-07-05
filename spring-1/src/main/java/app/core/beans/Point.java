package app.core.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
@Scope("prototype")
public class Point {

	{ // initializer
		System.out.println("Point Created");
	}

	private int x;
	private int y;

}
