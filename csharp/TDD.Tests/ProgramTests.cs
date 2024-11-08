using Xunit;
using CodeWars;

namespace CodeWars.Tests
{
        public class IsEvenTests
        {
                [Fact]
                public void IsEvenReturnsTrueForEvenNumber()
                {
                        var number = 10;
                        var expectedResult = true;
                        var result = Program.IsEven(number);
                        Assert.Equal(expectedResult, result);
                }

                [Fact]
                public void IsEvenReturnsFalseForOddNumber()
                {
                        var number = 11;
                        var expectedResult = false;
                        var result = Program.IsEven(number);
                        Assert.Equal(expectedResult, result);
                }
        }
}
