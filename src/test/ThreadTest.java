package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.MainQuestao2A;

class ThreadTest {

	public MainQuestao2A startThread;

	@BeforeEach
	public void setUp() {
		startThread = new MainQuestao2A();
	}

	@SuppressWarnings("static-access")
	@Test
	public void Thread() {
		long start1 = System.currentTimeMillis();
		startThread.main(null);
		long end1 = System.currentTimeMillis();   
		System.out.println("Tempo de execução em segundo: "+ (end1-start1)/1000.0);
		assertTrue((end1-start1)/1000.0 < 3.1);
	}


}
