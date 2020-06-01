package com.example.myapplication.ui



// 안드로이드에서 화면을 그리는 방법
// - XML을 이용한다.
// - XML > DSL -> Domain Specific Language
// - UI를 그리기 위해 특화되어 있다.

// 핸드폰마다 화면 크기가 다 다른데 어떻게 화면을 그려야 할까?
// - 픽셀, dpi, dp
// - ldpi -> 120 (1인치에 120픽셀)
// - mdpi -> 160
// - hdpi -> 240
// - xhdpi -> 320
// - xxhdpi -> 480
// - xxxhdpi -> 640

// - dp -> Density Independent Pixel
//      - 픽셀 독립적인 단위
// - 픽셀보다 dp를 사용해야 디바이스 width에 대응하기가 쉽다.