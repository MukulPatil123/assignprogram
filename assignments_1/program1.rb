#!/usr/bin/ruby -w
string_1="i am learning Ruby language."
string_2="why? Coz it's cool and I like it."
puts string_1.upcase
puts string_1.downcase
puts string_1.swapcase
puts string_1.count(string_1)
if string_1.scan("ruby")
  puts "found"
end
puts string_2.split("?")
string_3=string_1+string_2
puts string_3
puts string_3.sub("I","we");
puts s=string_1.to_sym
puts s.class
puts string_1.methods
a=string_1.length
b=string_2.length
puts c=b - a

variable=nil
puts variable.to_s
puts variable.to_f
puts variable.to_a




