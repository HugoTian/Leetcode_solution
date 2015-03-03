class Solution:
    # @param tokens, a list of string
    # @return an integer
    def evalRPN(self, tokens):
        stack = []
        for i in range(0,len(tokens)):
            if tokens[i]=="+":
                a = stack.pop()
                b = stack.pop()
                c= int(a)+int(b)
                stack.append(str(c))
            elif tokens[i]=="-":
                a = stack.pop()
                b = stack.pop()
                c= int(b)-int(a)
                stack.append(str(c))
            elif tokens[i]=="*":
                a = stack.pop()
                b = stack.pop()
                c= int(a)*int(b)
                stack.append(str(c))
            elif tokens[i]=="/":
                a = stack.pop()
                b = stack.pop()
                if int(a) * int (b) <0 and abs(int(b)) %abs(int(a)) !=0:
                    c= int(b)/int(a) +1
                else:
                    c= int(b)/int(a) 
                stack.append(str(c))
                
            else:
                 stack.append(tokens[i])
        return int(stack.pop())