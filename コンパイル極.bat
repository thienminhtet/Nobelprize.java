echo off
rem  Javaソース・ファイルを 作成する
:: cmd /Q/k ^  A & B
 cd  %UserProfile%\Desktop
 set Fname=
 echo Java の クラス名を 入力しなさい
 set /p  Fname="・・・ >"
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
echo コンパイル終了  実行するにはキーを押しなさい
Pause >nul

 echo java %Fname%

 java  -cp .  -Xmx1200M %Fname%

 echo.
 echo == 実行完了 ==

echo 保存して、もう一度コンパイルしよう
Pause
GOTO EDIT_SOURCE_FILE

:DEBUGGG

echo 保存して、もう一度コンパイルしよう
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