using System;

namespace CodeWars
{
    public class Program
    {
        static void Main(string[] args)
        {
            int number = 8;
            bool result = IsEven(number);

            Console.WriteLine($"Is {number} even? {result}");
        }

        public static bool IsEven(int number)
        {
            return (number % 2) == 0;
        }
    }
}