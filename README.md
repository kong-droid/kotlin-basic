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
### (5) Functions
#### 1) function
1. Functions.kt
```
- 함수 뒤 소괄호에 매개변수 적는다.
- 매개변수가 여러개일 때 반드시 콤마(,)를 사용한다.
- 함수의 기능 코드를 작성할 때 중괄호 안에 작성한다.
- return은 함수를 종료하거나 응답값을 반환할 때 사용한다.
```
2. NamedArguments.kt
```
- 매개변수명을 적고 내용을 기재하면 해당 파라미터에 원하는 값이 출력된다.
```
3. DefaultParameterValues.kt
```
- 함수의 매개변수값을 기본값으로 지정할 수 있다.
- 기본값을 지정할 때는 parameter: type = "value" 형식으로 구성할 수 있다.
- 기본값을 지정했더라도 원하는 값으로 변경할 수 있다.
```
4. FunctionWithoutReturn.kt
```
- 함수가 반환값이 없는 경우 return 키워드나 반환 유형을 선언하지 않아도 된다.
```
5. SingleExpressionFunction.kt
```
- 간략하게 줄여 함수를 만들 수 있다.
- 중괄호 대신 = 를 사용해 반환값을 표현할 수 있다.
```
#### 2) Lambda Expression
1. AssignToVariable.kt
```
- 코틀린은 간결한 코드인 람다를 제공한다.
- 파라미터는 -> 뒤에 간략하게 표현할 수 있다.
- 함수의 바디값도 -> 뒤에 간략하게 표현할 수 있다.
```
2. PassToAnotherFunction.kt
```
- filter()을 사용해 컬렉션을 필터링 한다.
- map()을 사용해 컬렉션을 루프를 돌려 연산한다.
```
3. FunctionTypes.kt
```
- 기존 함수 매개변수 지정 방식 (variable1, variable2) 이었으나 
람다는 (variable1, variable2) -> 로 작성할 수 있다.
- (message: String, prefix: String) 매개변수명과 타입 지정, -> String (리턴 타입)
- {message, prefix -> "[$prefix] $message"} 리턴값에 맞춘 답
```
4. ReturnFromAFunction.kt
5. InvokeSeparately.kt
6. TrailingLambdas.kt
```
- 람다 식이 유일한 매개변수 일 경우 함수 괄호를 삭제 후 괄호 외부에 값을 작성할 수 있다.
- fold() 함수를 통해 초기값과의 후행값으로 연산할 수 있다.
```
### (6) Classes
1. Contact.kt
```
- 코틀린은 객체 지행 언어로써 클래스와 객체를 제공한다.
- 프로그램에서 객체는 데이터의 저장을 쉽게 만든다.
- 클래스는 선언된 객체의 일련의 특성을 허용한다.
- 만약 클래스로부터 객체들을 생성한다면 여러번 같은 특성을 선언할 필요가 없으므로 프로그램이 용이해진다.
- 클래스는 객체의 속성을 선언할 수 있다.
- 클래스 인스턴스가 생선된 후 속성을 변경하는 경우가 아니라면 읽기 전용으로 선언하는 것이 좋다.
- 괄호 안에 val or var 없이 속성을 선언할 수 있으나 인스턴스가 생선된 후에는 이러한 속성에 엑세스할 수 없다.
- 클래스 객체 접근: class.objectName
- string template: "${class.objectName}"
- 클래스 내 함수 호출: class.fun()
```
2. User.kt
```
- data 클래스는 데이터 저장에 유용한 클래스다.
- data 클래스는 클래스와 동일한 기능이 제공되지만 시퀀스가 자동으로 채번된다.
- 한번 지정하면 똑같은 코드를 여러번 작성하지 않아도된다.
- 인스턴스를 쉽게 읽어올 수 있고, 클래스끼리 비교하고 복사하기 쉽다.
```
| 함수              | 설명                                           |
|:----------------|:---------------------------------------------|
| .toString()     | 클래스 인스턴스와 해당 속성을 읽을 수 있도록 문자열을 인쇄한다.         |
| .equals() or == | 클래스 인스턴스를 비교한다.                              |
| .copy()         | 다른 속성을 사용해 다른 클래스 인스턴스를 복사하고 클래스 인스턴스에 복사한다. |
### (7) Null safety
1. NullableTypes.kt
```
- 프로그램에서 null 값이 허용되는 경우 명시적으로 선언한다.  
- null 값을 확인하고, 값이 감지되면 수행할 작업을 선언한다.
```
2. CheckForNullValues.kt
```
- null을 체크하는 조건문이 있다.
- null이 아니거나 length이 0 아닌 경우를 체크할 수 있다. 
```
3. UseSafeCalls.kt
```
- ?. : nullable check 
- ?: : elvis operator, 삼항연산자와 비슷하다. 
- ex ) object ?: "defalut" 객체가 null이면 "default"를 반환한다.
```
