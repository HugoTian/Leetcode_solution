class Solution:
    # @param A, a list of integer
    # @return an integer
    def singleNumber(self, A):
        x = 0
        for numbers in A:
            x=x^numbers
        return x