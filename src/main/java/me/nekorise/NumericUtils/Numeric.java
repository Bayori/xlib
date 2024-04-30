package me.nekorise.NumericUtils;

import java.util.Random;

public class Numeric
{
    public static boolean isNumeric(String strNum)
    {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean isValidInt(String integer)
    {
        try
        {
            Integer.parseInt(integer);
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }
    public static boolean isValidDouble(String _double)
    {
        try
        {
            Double.parseDouble(_double);
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }
    public static boolean isValidFloat(String _float)
    {
        try
        {
            Float.parseFloat(_float);
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }

    public static double percentFromValue(double current, double max)
    {
        return (current/max) * 100;
    }

    public static double valueFromPercent(double percent, double value)
    {
        return value * (percent/100);
    }

    public static boolean chance(double percent)
    {
        if (percent < 0 || percent > 100) {
            throw new IllegalArgumentException("Дурачок? Проценты можно указывать в диапозоне от 0 до 100.");
        }

        Random rand = new Random();
        double randomPercent = rand.nextDouble() * 100;

        return randomPercent < percent;
    }

    public static int randomRange(int min, int max)
    {
        if (min >= max) {
            throw new IllegalArgumentException("Алё, минимальное значение должно быть меньше максимального");
        }

        Random rand = new Random();
        return rand.nextInt(max - min + 1) + min;
    }
}
