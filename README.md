## 💻 TDD

### 📚 Contents
- [5장. 솔직히 말하자면](https://github.com/junseokoh0/tdd/wiki/5%EC%9E%A5.-%EC%86%94%EC%A7%81%ED%9E%88-%EB%A7%90%ED%95%98%EC%9E%90%EB%A9%B4)  
- [6장. 돌아온 '모두를 위한 평등'](https://github.com/junseokoh0/tdd/wiki/6%EC%9E%A5.-%EB%8F%8C%EC%95%84%EC%98%A8-'%EB%AA%A8%EB%91%90%EB%A5%BC-%EC%9C%84%ED%95%9C-%ED%8F%89%EB%93%B1')  
- [7장. 사과와 오렌지](https://github.com/junseokoh0/tdd/wiki/7%EC%9E%A5.-%EC%82%AC%EA%B3%BC%EC%99%80-%EC%98%A4%EB%A0%8C%EC%A7%80)  
- [8장. 객체 만들기](https://github.com/junseokoh0/tdd/wiki/8%EC%9E%A5.-%EA%B0%9D%EC%B2%B4-%EB%A7%8C%EB%93%A4%EA%B8%B0)
- [9장. 우리가 사는 시간](https://github.com/junseokoh0/tdd/wiki/9%EC%9E%A5.-%EC%9A%B0%EB%A6%AC%EA%B0%80-%EC%82%AC%EB%8A%94-%EC%8B%9C%EA%B0%84)

### 🔖 To-do list
- $5 + 10CHF = $10(환율이 2:1일 경우)
- ~~$5 X 2 = $10~~
- ~~amount 를 private으로 만들기~~
- ~~Dollar 부작용(side effect)?~~
- Money 반올림
- ~~equals()~~
- hashCode()
- Equal null
- Equal object
- ~~5CHF X 2 = 10CHF~~
- Dollar/Franc 중복
- ~~공용 equals~~
- 공용 times
- ~~Franc과 Dollar 비하기~~
- ~~통화?~~
- testFrancMultiplication을 지워야 할까?

### Notion
#### 💡 주기
1. 작은 테스트를 하나 추가
2. 모든 테스트를 실행해서 테스트가 실패하는 것 확인
3. 조금 수정
4. 모든 테스트를 실행해서 테스트가 성공하는 것을 확인
5. 중복을 제거하기 위해 리팩토링

#### 💡 작동하는 깔끔한 코드를 만들자
우선, 작동하는 코드를 만들고 깔끔한 코드를 만들자

#### 💡 최대한 빨리 초록색을 보기 위해 취할 수 있는 전략
- **가짜로 구현하기**
  상수를 반환하게 만들고 진짜 코드를 얻을 때까지 단계적으로 상수를 변수로 바꾸어 간다  
- **명백한 구현 사용하기**
  실제 구현을 입력
  
> 뭘 입력해야 할지 알 때는 **명백한 구현**  
예상치 못한 빨간 막대를 만나게 되면 **가짜로 구현**  


