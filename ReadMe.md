This project describes strange behaviour of Spring Framework Profile (ver 3.1.2.RELEASE).

This project contains two configuration files : ConfigDefault (which is not annotated with @Profile) and
Config1 (which is annotated with @Profile("config1")). Every configuration contains bean "example". We will
see strange situation, that Spring chooses appropriate configuration depending on configuration class name!   

When you run this application, with setting active profile = "config1", Spring chooses ConfigDefault, even if we
set active profile!!!! Let's see another trick, let's rename ConfigDef ault class name to-> "A". What is result? 
Now we see that Config1 is choosen.

It's a very strange behaviour. I spent a lot of time, trying to understand, why in test environment my application
works in one way, in prod environment - in another)))))

SOLUTION --> just annotate ConfigDefault with @Profile("default").   