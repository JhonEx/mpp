package lesson9.labs.prob14;

import java.util.Optional;

public class MySingletonLazy {
	private static MySingletonLazy instance;

	private MySingletonLazy() {
	}
	public static MySingletonLazy getInstance() {
		Optional.ofNullable(instance).orElseGet(MySingletonLazy::new);
		return instance;
	}

}
