# CleanArchitureStudy

## 목표
- Android clean architecture 를 학습하는 용도로 영화 리스트를 보여주는 토이 프로젝트를 진행합니다.
- Step 순서대로 학습이 진행되었습니다.
- 해당 클린아키텍처 스터디를 마치고 멀티모듈의 관점과 클린아키텍처의 관점에서의 리뷰를 간단히 진행하였습니다.

## API 사용
- 네이버 OPEN API 검색 > 영화
  [링크주소]
  (https://developers.naver.com/docs/search/movie/)

---

### Step1
[요구사항]
- 순수 코틀린 모듈인 domain 모듈을 만든다.
- 순수 코틀린 모듈인 data 모듈을 만든다.
- data 모듈은 domain 모듈을 implementation 해야 한다.
- app 모듈은 data, domain 모듈을 implementation 해야 한다.

---

### Step2
[요구사항]
네이버 API를 사용해서 영화 정보를 가져와야 합니다
- GET, v1/search/movie.json

프로그래밍 요구 사항
영화 정보를 가져오는 API는 data 모듈에 구현되어야 합니다
data 모듈의 구현체는 모두 internal 키워드가 붙어야 합니다

### Step3
요구 사항
네이버 API를 사용해서 영화 정보를 가져와야 합니다
GET, v1/search/movie.json
프로그래밍 요구 사항
영화 정보를 가져오는 API는 data 모듈에 구현되어야 합니다
data 모듈의 구현체는 모두 internal 키워드가 붙어야 합니다

### Step4
프로그래밍 요구사항
Hilt를 사용해서 의존성을 주입해주세요.
UseCase가 Inject되어있는 빈 ViewModel까지 만들어주세요.
ViewModel을 만들어야만 정상적으로 DI가 적용되서 빌드가 되는지 확인이 가능합니다.
data 모듈에는 internal 키워드를 유지해주세요.
app 모듈을 제외한 나머지 모듈에서는 hilt-core를 사용하시면 됩니다.
참고 : https://mvnrepository.com/artifact/com.google.dagger/hilt-core

```
implementation com.google.dagger:hilt-core:${Version.HILT}
kapt com.google.dagger:hilt-compiler:${Version.HILT}

```

---
