package com.chan.moviesearcher.data.entity

class MovieResponseTest {

    companion object {
        private const val MOVIE_RESPONSE_JSON =
            """
            {
                    "lastBuildDate": "Wed, 06 Oct 2021 22:57:59 +0900",
                    "total": 88,
                    "start": 2,
                    "display": 10,
                    "items": [
                        {
                            "title": "보이나로비치",
                            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=193591",
                            "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/1935/193591_P01_130234.JPG",
                            "subtitle": "Wojnarowicz",
                            "pubDate": "2020",
                            "director": "크리스 맥킴|",
                            "actor": "",
                            "userRating": "0.00"
                        },
                        {
                            "title": "퍼킹 고스트",
                            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=203180",
                            "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/2031/203180_P01_102421.JPG",
                            "subtitle": "Fucking Ghosts",
                            "pubDate": "2020",
                            "director": "제이슨 쿡|",
                            "actor": "콜린 퍼거슨|벤 모리슨|",
                            "userRating": "0.00"
                        },
                        {
                            "title": "괴짜들",
                            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=184383",
                            "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/1843/184383_P03_162726.jpg",
                            "subtitle": "<b>F</b> for Freaks",
                            "pubDate": "2019",
                            "director": "자비네 에얼|",
                            "actor": "",
                            "userRating": "0.00"
                        },
                        {
                            "title": "Cook <b>F</b>**k Kill",
                            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=192532",
                            "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/1925/192532_P01_151506.jpg",
                            "subtitle": "Cook <b>F</b>**k Kill",
                            "pubDate": "2019",
                            "director": "미라 포르나이|",
                            "actor": "",
                            "userRating": "0.00"
                        },
                        {
                            "title": "빡트",
                            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=195202",
                            "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/1952/195202_P01_140844.jpg",
                            "subtitle": "<b>F</b>'ACT",
                            "pubDate": "2019",
                            "director": "원유|",
                            "actor": "김희상|",
                            "userRating": "0.00"
                        },
                        {
                            "title": "아임 낫 유어 <b>F</b>***ing 스테레오타입",
                            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=191173",
                            "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/1911/191173_P01_164502.jpg",
                            "subtitle": "I'm Not Your <b>F</b>***ing Stereotype",
                            "pubDate": "2019",
                            "director": "히소메 체마마|",
                            "actor": "",
                            "userRating": "0.00"
                        },
                        {
                            "title": "더 데스 앤 라이프 오브 존 <b>F</b>. 도노반",
                            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=133444",
                            "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/1334/133444_P08_181647.jpg",
                            "subtitle": "The Death and Life of John <b>F</b>. Donovan",
                            "pubDate": "2018",
                            "director": "자비에 돌란|",
                            "actor": "키트 해링턴|벨라 손|나탈리 포트만|사라 가돈|제이콥 트렘블레이|",
                            "userRating": "9.45"
                        },
                        {
                            "title": "케이.지.에프 : 전설의 시작",
                            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=191809",
                            "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/1918/191809_P00_160117.jpg",
                            "subtitle": "K.G.<b>F</b>: Chapter 1",
                            "pubDate": "2018",
                            "director": "프라샨스 닐|",
                            "actor": "야쉬|스르니디 쉐티|",
                            "userRating": "0.00"
                        },
                        {
                            "title": "아이 퍽드 어 머메이드 앤 노 원 빌리브즈 미",
                            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=181761",
                            "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/1817/181761_P01_164142.jpg",
                            "subtitle": "I <b>F</b>*cked A Mermaid And No One Believes Me",
                            "pubDate": "2018",
                            "director": "마들렌 고틀리브|",
                            "actor": "루퍼트 레이드|",
                            "userRating": "0.00"
                        },
                        {
                            "title": "<b>F</b>*ck",
                            "link": "https://movie.naver.com/movie/bi/mi/basic.nhn?code=181782",
                            "image": "https://ssl.pstatic.net/imgmovie/mdi/mit110/1817/181782_P01_164131.jpg",
                            "subtitle": "",
                            "pubDate": "2018",
                            "director": "대니 모건|",
                            "actor": "브렛 골드스타인|",
                            "userRating": "0.00"
                        }
                    ]
                }
            """
    }
}