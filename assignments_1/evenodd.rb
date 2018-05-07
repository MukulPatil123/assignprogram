#!/usr/bin/ruby -w
def even
  number=gets
  if (number.to_i%2==0)
    then
  print "number is even"
else
  print "number is odd"
end
end
puts even