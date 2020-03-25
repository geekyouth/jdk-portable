复制以下命令，在解压后的 jdk 主目录以管理员 cmd 执行
for /r %x in (*.pack) do .\bin\unpack200 -r "%x" "%~dx%~px%~nx.jar"