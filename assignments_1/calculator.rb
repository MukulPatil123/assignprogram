#!/usr/bin/ruby -w
#var=gets.to_i
puts "1st number"
n1=gets.to_i

puts "2nd number"
n2=gets.to_i

puts "Enter choice"
choice=gets.chomp

case choice
when "a"
  tot=n1+n2
  puts "Addition is:#{tot} "
when "s"
  tot=n1-n2
  puts "Subtraction is:#{tot} "
when "m"
  tot=n1*n2
  puts "Multiplication is:#{tot} "
when "d"
  tot=n1/n2
  puts "Division is:#{tot} "
else
  puts "Invalid"
end

