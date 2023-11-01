kotlin-basic
===
### (1) hello_word
1. HelloWorld.kt
```
- fun은 함수를 선언하는 방법
- main() 함수는 프로그램이 시작하는 함수이다.
- 함수의 바디값은 중괄호에 작성한다. {}
- println()과 print()는 함수에서 내가 작성한 요구사항이 출력된다.
```
2. Variables.kt
```
- 변수 선언
- val: final(read-only)
- var: 변경 가능한 변수(mutable variable)
```
3. StringTemplate.kt
```
- 코틀린은 변수의 타입을 지정하지 않아도 된다.
- 다만, 코틀린은 변수에 입력된 값을 기준으로 변수의 타입을 판단한다.
- String Template 내에서 정수를 수정하고 싶은 경우 ${} 사이에 두고 연산한다.
```

### (2) basic_types
1. BasicTypes.kt
```
- 코틀린은 모든 변수의 구조 및 자료형을 가지고 있다.
- 사용자가 데이터를 입력하면 컴파일러가 자료와 구조를 파악 후 알려줘야 한다.
- 즉, 기능과 속성을 정의할 수 있다.
- +=, -=, *=, /=, %= 는 증감 할당 연산자이다.
```

2. DeclareType.kt
```
- 초기화 하지 않고 변수를 선언하려면 :로 변수 유형을 지정한다.
```
| 카테고리                   | 기본 자료형                     |
|------------------------|:---------------------------|
| Integers               | Byte, Short, Int, Long     |
| Unsigned integers      | UByte, UShort, UInt, ULong |
| Floating-point numbers | Float, Double              |
| Booleans               | Boolean                    |
| Characters             | Char                       |
| Strings                | String                     |


