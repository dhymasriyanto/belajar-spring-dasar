package ngodingkuy.tech.spring.core.commandapp;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LogCommandLineRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		log.info("Log command line runner : {}", Arrays.toString(args));
	}

	
}

