public class FizzBuzz {

	public String say(int number) {
		Rule[] rules = { 
				new FB(), new Fizz(), 
				new Buzz(), new Wow(),
				new Default() 
				};
		for (Rule rule : rules) {
			if (rule.isValid(number)) {
				return rule.say();
			}
		}
		return "";
	}
}
