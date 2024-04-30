
![Logo](https://github.com/Bayori/xlib/blob/main/logoXLIB.png?raw=true)


## Подключение зависимостей

```xml
</repositories>
    <repository>
        <id>xlib-mvn-repo</id>
        <url>https://raw.github.com/Bayori/xlib/main/target/mvn-repo</url>
    </repository>
</repositories>
```
```xml
<dependencies>
    <dependency>
        <groupId>me.nekorise</groupId>
        <artifactId>xlib</artifactId>
        <version>1.0</version>
    </dependency>
</dependencies>
```
- Так же необходимо добавить .jar библиотеки на сервер -> [Скачать](https://github.com/Bayori/xlib/releases)
- Если ты не хочешь заставлять администраторов сервера добавлять отдельный .jar для твоего плагина, то используй shade-plugin в своеём проекте для этой библиотеки

# Класс Numeric
|       Функция      |           Параметры          | Возвращает (Тип) |                                                           Описание                                                          |
|:------------------:|:----------------------------:|:----------------:|:---------------------------------------------------------------------------------------------------------------------------:|
|     isNumeric()    |         String number        |      boolean     |                               Возвращает `true` если строка число, `false` в противном случае                               |
|    isValidInt()    |        String integer        |      boolean     | Возвращает `true` если int в строке соответствует своему диапазону Java (-2147483648 ... 2147483648), `false` в противном случае |
|   isValidDouble()  |        String _double        |      boolean     |                                                              Возвращает `true` если double в строке соответствует своему диапазону Java, `false` в противном случае |
|   isValidFloat()   |         String _float        |      boolean     |                                                              Возвращает `true` если float в строке соответствует своему диапазону Java, `false` в противном случае |
| percentFromValue() |  double current, double max  |      double      |                                     Возвращает процент, которым является число от числа                                     |
| valueFromPercent() | double percent, double value |      double      |                                    Возвращает число, процент которого составляет от числа                                   |
|      chance()      |        double percent        |      boolean     |                                  Возвращает `true`/`false` в соответствии с заданным шансом                                 |
|    randomRange()   |       int min, int max       |        int       |                                     Возвращает случайное значение из заданного диапазона                                    |

# Класс HEX
|     Функция     |                     Параметры                    | Возвращает (Тип) |                                Описание                               |
|:---------------:|:------------------------------------------------:|:----------------:|:---------------------------------------------------------------------:|
|   applyColor()  |                     String s                     |      String      |                  Возвращает отформатированную строку                  |
|  rainbowText()  |                  String message                  |      String      |        Возвращает отформатированную радужным градиентом строку        |
|  gradientText() | String message, Color startColor, Color endColor |      String      |             Возвращает отформатированную градиентом строку            |
| parseHexColor() |                  String hexColor                 |       Color      | Возвращает объект типа Color, полученный из введённого HEX-кода цвета |

# Класс Log
| Функция |           Параметры           | Возвращает (Тип) |                             Описание                            |
|:-------:|:-----------------------------:|:----------------:|:---------------------------------------------------------------:|
| error() | JavaPlugin caller, String msg |        -          |         Пишет в консоль сообщение типа "SEVERE" (Ошибка)        |
|  warn() | JavaPlugin caller, String msg |         -         |    Пишет в консоль сообщение типа "WARNING" (Предупреждение)    |
|  info() | JavaPlugin caller, String msg |      -            |           Пишет в консоль сообщение типа "INFO" (Инфо)          |
| debug() | JavaPlugin caller, String msg |         -         | Пишет в консоль сообщение типа "WARNING" с припиской "[DEBUG] " |

# Класс ServerUtils
|   Функция   |  Параметры  | Возвращает (Тип) |                              Описание                             |
|:-----------:|:-----------:|:----------------:|:-----------------------------------------------------------------:|
| hasPlugin() | String name |      boolean     | Возвращает `true`/`false` если плагин найден/не найден на сервере |

# Класс Skull
|    Функция    |           Параметры          | Возвращает (Тип) |                                                                    Описание                                                                    |
|:-------------:|:----------------------------:|:----------------:|:----------------------------------------------------------------------------------------------------------------------------------------------:|
| getHeadItem() | String nickname ИЛИ Player p |     ItemStack    | Возвращает голову игрока с указанным скином как ItemStack. ВАЖНО: Лучше использовать данный метод асинхронно (Например, через BukkitScheduler) |
