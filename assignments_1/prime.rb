#!/usr/bin/ruby -w
puts "1st number"
s=gets.to_i
puts "2nd number"
u=gets.to_i

for s in s..u
  flag=false
  for j in 2..s/2
    if(s%j==0)
      flag=true
      break
    end
  end
    if(flag==false)
      puts "#{s}"
  end
end
