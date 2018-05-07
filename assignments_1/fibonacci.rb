#!/usr/bin/ruby -w
def fib(num)
  puts n1 = 1
  puts n2 = 2
  i = 2
  while (i <= num)
    n3 = n2 + n1
    puts n3
    n1 = n2
    n2 = n3
    i =i+1
  end
end
fib(10)
