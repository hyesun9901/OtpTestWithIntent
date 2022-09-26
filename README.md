# 📌Google Otp Test(Android)
### ✔Google otp앱을 미리 깔아두자!
</br>
  <h2> 💜앱 동작방식</h3>
<div>
  <h3> 1. 사용자가 앱에서ID/PW를 통한 로그인 (테스트앱이기 때문에 서버에서 로그인 성공 리턴했다고 가정..)</h3>
  <img src="https://user-images.githubusercontent.com/60701949/192295658-62de0206-4474-4ff9-931f-07d4712af969.png" width="400" height="900"/>
</div>
<hr>
<div style="margin-top:50dp;">
  <h3> 2. 첫 로그인 시 Google OTP앱에 등록할 Key를 사용자에게 보여준다.</h3>
  <img src="https://user-images.githubusercontent.com/60701949/192297286-e2448eec-c234-41de-bc6f-402fc4afb457.png" width="400" height="900"/>
</div>
<h4>👉 key를 누르고있으면 클립보드에 복사됨</h3>
<h4>👉 일반적으로 이 부분은 웹사이트에서 보여주지만 테스트이기 때문에 앱 단에서 그냥 해보는 것임</h3>
<hr>
<div style="margin-top:60dp;">
  <h3> 3. 사용자는 Google OTP 앱에 Key를 복사하여 OTP 등록 후, 원래의 앱으로 돌아와서 완료버튼 클릭 시 OTP 입력화면 발생</h3>
  <img src="https://user-images.githubusercontent.com/60701949/192299268-cf042ee8-304f-4c2e-87e7-0718cf4c6317.png" width="400" height="900"/>
  <img src="https://user-images.githubusercontent.com/60701949/192300716-e06b4846-af0c-414a-913d-ef70fdf74a48.png" width="400" height="900"/>

</div>
<hr>
<div style="margin-top:60dp;">
  <h3> 4. Google OTP앱에 떠있는 OTP번호를 입력하여 확인버튼을 통해 검증가능</h3>
  <img src="https://user-images.githubusercontent.com/60701949/192301150-d060319f-a99e-48b3-8e4a-806f22929608.png" width="400" height="900"/>
  <h4>👉OTP번호가 유효할 경우 인증완료 메시지 발생함. 이후 처리는 개인용도에 맞게 처리하면 됨</h4>
  <h4>👉시간차이문제인지 30초 간격으로 OTP번호가 변하지만 2분 정도까지 유효한 번호임!
</div>
<hr>
