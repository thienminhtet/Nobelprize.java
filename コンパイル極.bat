echo off
rem  Java�\�[�X�E�t�@�C���� �쐬����
:: cmd /Q/k ^  A & B
 cd  %UserProfile%\Desktop
 set Fname=
 echo Java �� �N���X���� ���͂��Ȃ���
 set /p  Fname="�E�E�E >"
 set ff=%UserProfile%\Desktop\%Fname%
 set f=%ff%.java
IF  EXIST %f% GOTO EDIT_SOURCE_FILE
 copy  template %f% >nul

:EDIT_SOURCE_FILE
"C:\Program Files (x86)\TeraPad\TeraPad.exe"  %f%
 set OLDPATH=%PATH%
 set PATH=%ProgramFiles%\Eclipse Adoptium\jdk-11.0.18.10-hotspot\bin
rem javac -Xstdout err.txt  %f%
 echo javac %Fname%.java
 javac -cp .  %f%

echo.
 set   cc=%ff%.class
 rem   echo  %cc%

IF NOT EXIST %cc% GOTO  DEBUGGG
echo �R���p�C���I��  ���s����ɂ̓L�[�������Ȃ���
Pause >nul

 echo java %Fname%

 java  -cp .  -Xmx1200M %Fname%

 echo.
 echo == ���s���� ==

echo �ۑ����āA������x�R���p�C�����悤
Pause
GOTO EDIT_SOURCE_FILE

:DEBUGGG

echo �ۑ����āA������x�R���p�C�����悤
Pause
GOTO EDIT_SOURCE_FILE

 set  PATH=%OLDPATH%
 set  Fname=
 set  f=
 set  ff=
 Pause >nul
IF EXIST %cc% ((set cc=) & EXIT )
 set  cc=
cmd /Q/k echo.