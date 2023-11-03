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


### (3) Collections
```
- 코틀린은 그룹 데이터를 관리하기 위해 collections 자료형을 제공한다.
```
| 컬렉션 타입 | 설명                      |
|:-------|:------------------------|
| Lists  | 중복되는 모든 목록 값            |
| Sets   | 중복되지 않는 모든 목록 값         |
| Maps   | 중복되지 않는 Key-Value 값 |

1. List.kt
```
- listOf(): 읽기 전용 목록을 만든다.
- mutableListOf(): 수정할 수 있는 목록을 만든다.
- 목록의 타입을 선언할 때 <>안에 정의할 수 있다.
- first(): 목록의 첫번째 항목을 가져옴
- last(): 목록의 마지막 항목을 가져옴
- count(): 목록의 갯수
- add(): 목록에 추가함
- remove(): 특정 내용을 목록에서 제거함
- Object in "content": 객체 내의 content를 찾음, boolean 반환
- list의 2번째 객체 반환: list[1]
```
2. Set.kt
```
- setOf(): 읽기 전용 목록을 만든다.
- mutableSetOf(): 수정할 수 있는 목록을 만든다.
- Set 타입을 선언할 때 <>안에 정의할 수 있다.
- first(): 목록의 첫번째 항목을 가져옴
- last(): 목록의 마지막 항목을 가져옴
- count(): 목록의 갯수
- add(): 목록에 추가함
- remove(): 특정 내용을 목록에서 제거함
- Object in "content": 객체 내의 content를 찾음, boolean 반환
- list의 2번째 객체 반환: list[1]
```
3. Map.kt
```
- Map은 key와 value 가 한 쌍으로 구성된다.
- key값은 중복될 수 없다.
- mapOf(): 읽기 전용 객체를 만든다.
- mutableMapOf(): 수정할 수 있는 객체를 만든다.
- ["key"]: 해당 key의 value 값을 도출한다.
- count(): key-value 쌍의 갯수
- put(): key-value값을 객체에 저장한다.
- remove(): 입력한 key값을 삭제한다.
- containKey(): key값으로 map내 객체 유무를 확인한다.
- .keys: 키값을 배열로 가져옴
- .values: 값을 배열로 가져옴
```
### (4) Control Flow
1. ConditionExpression.kt
```
++ if 절
- if문은 if 뒤에 소괄호를 넣되, 소괄호에는 조건문을 넣는다.
- 이후 중괄호로 조건에 부합하는 값이 올 경우 코드를 작성한다.
- 만약 다른 조건값이 있다면 else {}를 사용 후 조건에 맞는 코드를 작성한다.
- 또 중괄호 안의 내용이 간결하다면 중괄호는 생략 가능하다.
- val object = condition ? "AAA" : "BBB"와 같은 삼항 연산자도 같은 조건이다.

++ when 절
- 조건이 여러개일 경우 사용한다.
- when 뒤에 소괄호를 두고 조건을 기재한다.
- 중괄호에 조건을 적고 -> 로 해당하는 조건 코드를 작성한다.
- 가장 마지막에 포괄적으로 정리할 경우 else를 사용한다.

++ if문과 when문 모두 조건절에 연산자를 사용할 수 있다.
```
2. Range
```
- ..: 범위 사이의 모든 값 ex) 1..4 = 1,2,3,4
- ..<: 범위 사이의 최대값 미만  ex) 1..<4 = 1,2,3
- downTo: ..을 역순으로한 것 ex) 4 downTo 1 = 4, 3, 2, 1
- step: 지정한 값만 큼 증산해서 값을 정함 ex) 1..5 step 2 = 1, 3, 5
- 자료형이 Char인 경우도 이 범위가 적용될 수 있다.
```
3. Loop.kt
```
- 대부분 프로그래밍에서 반복문을 사용할 때 for문과 while문을 사용한다.
- for문은 값을 지정해 그값을 넘기지 않게 반복문을 돌리는 것이다.
- while문은 특정 조건이 만족될 때 까지 반복문을 돌리는 것이다.
- while는 두 가지 방법이 있다.
- while: 특정 조건이 true가 될 때 까지 반복문을 돌림
- do-while: 코드의 첫번째 조건을 확인 한후 반복문을 돌림
```