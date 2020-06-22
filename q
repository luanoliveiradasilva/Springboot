[33mcommit 05fa3538305753c06d77ded0a1f224883cb44ce8[m[33m ([m[1;36mHEAD[m[33m, [m[1;31morigin/master[m[33m, [m[1;31morigin/HEAD[m[33m, [m[1;31morigin/CRUD[m[33m, [m[1;32mmaster[m[33m, [m[1;32mCRUD[m[33m)[m
Author: luanoliveiradasilva <luanoliveira1107@gmail.com>
Date:   Sat Jun 20 21:13:05 2020 -0300

    Criado CRUD via spring com consulta no postman.

 .../main/java/br/com/springBoot/awesome/endpoint/StudentEndPoint.java    | 1 [32m+[m
 1 file changed, 1 insertion(+)

[33mcommit 4f8f734ad94910d7a6ed69aebe0cc7b9c664dc79[m
Author: luanoliveiradasilva <luanoliveira1107@gmail.com>
Date:   Sat Jun 20 21:11:52 2020 -0300

    Criado CRUD via spring com consulta no postman.

 .../awesome/endpoint/StudentEndPoint.java          | 47 [32m+++++++++++++++++++[m[31m---[m
 demo/src/main/resources/application.properties     |  2 [32m+[m[31m-[m
 2 files changed, 42 insertions(+), 7 deletions(-)

[33mcommit 43503c39b03fa2b3eb270d958a7ab612dc690df8[m[33m ([m[1;31morigin/Post[m[33m, [m[1;32mPost[m[33m)[m
Author: luanoliveiradasilva <luanoliveira1107@gmail.com>
Date:   Sat Jun 20 17:58:24 2020 -0300

    POST Request

 .../main/java/br/com/springBoot/awesome/endpoint/StudentEndPoint.java    | 1 [32m+[m
 1 file changed, 1 insertion(+)

[33mcommit 5f43f37ffb00fc7d2b29c41e4a72fe8e25e615d3[m
Merge: 7e86908 feeff45
Author: luanoliveiradasilva <luanoliveira1107@gmail.com>
Date:   Sat Jun 20 17:53:55 2020 -0300

    Merge branch 'Post' of https://github.com/luanoliveiradasilva/Springboot into Post

[33mcommit 7e86908ea28e95afc4c096ef0cffdae5a5827ea4[m
Author: luanoliveiradasilva <luanoliveira1107@gmail.com>
Date:   Sat Jun 20 17:53:29 2020 -0300

    POST Request

 .../main/java/br/com/springBoot/awesome/DemoApplication.java   |  1 [31m-[m
 .../br/com/springBoot/awesome/endpoint/StudentEndPoint.java    | 10 [32m++++++++++[m
 2 files changed, 10 insertions(+), 1 deletion(-)

[33mcommit feeff4512a03e27592f64dd855fc7fcbfc69c741[m
Merge: cd5fa26 0647815
Author: luanoliveiradasilva <luanoliveira1107@gmail.com>
Date:   Sat Jun 20 17:47:24 2020 -0300

    Merge branch 'master' into Post

[33mcommit cd5fa2612cd836c4cdd4951bb054fba7bd519a1e[m
Author: luanoliveiradasilva <luanoliveira1107@gmail.com>
Date:   Sat Jun 20 17:43:15 2020 -0300

    POST Tequest

 demo/src/main/java/br/com/springBoot/awesome/DemoApplication.java | 1 [32m+[m
 1 file changed, 1 insertion(+)

[33mcommit ac0414ee5a5820c86db9f76d707e4b8085565df1[m
Author: luanoliveiradasilva <luanoliveira1107@gmail.com>
Date:   Sat Jun 20 17:39:38 2020 -0300

    Método de requisição POST

 .../java/br/com/springBoot/awesome/endpoint/StudentEndPoint.java   | 7 [32m+++++++[m
 1 file changed, 7 insertions(+)

[33mcommit 06478159938dd241409da9d5da10b62732669630[m
Merge: 7b35bab 307451e
Author: Luan Nascimento Oliveira <luanoliveira1107@gmail.com>
Date:   Fri Jun 19 00:00:20 2020 -0300

    Merge pull request #1 from luanoliveiradasilva/hasCode
    
    Has code

[33mcommit 307451ebdcfa0ec58b6977389d0d20bc09ae5d69[m
Author: Luan Nascimento Oliveira <luanoliveira1107@gmail.com>
Date:   Thu Jun 18 23:43:44 2020 -0300

    Update README.md

 README.md | 32 [32m+++++++++++++++++++++++++++++++[m[31m-[m
 1 file changed, 31 insertions(+), 1 deletion(-)

[33mcommit c43d795398c413745f63319e899bdd85fd7051bb[m[33m ([m[1;32mhasCode[m[33m)[m
Author: Elen Nascimento <luanoliveira1107@gmail.com>
Date:   Thu Jun 18 23:27:30 2020 -0300

    Sprint boot Essentials 05 - Padrões REST e POST pt 01

 .../main/java/br/com/springBoot/awesome/endpoint/StudentEndPoint.java    | 1 [31m-[m
 1 file changed, 1 deletion(-)

[33mcommit de0baf07d2d7f6861d912ee85664461e9c71fed5[m
Author: Elen Nascimento <luanoliveira1107@gmail.com>
Date:   Thu Jun 18 23:17:20 2020 -0300

    Sprint boot Essentials 05 - Padrões REST e POST pt 01

 .../main/java/br/com/springBoot/awesome/endpoint/StudentEndPoint.java    | 1 [32m+[m
 1 file changed, 1 insertion(+)

[33mcommit 768dded32e1d4d71ebedaed6fd62eaad590e9e5d[m
Author: Elen Nascimento <luanoliveira1107@gmail.com>
Date:   Thu Jun 18 23:14:50 2020 -0300

    Sprint boot Essentials 05 - Padrões REST e POST pt 01

 .../br/com/springBoot/awesome/DemoApplication.java |  1 [31m-[m
 .../awesome/endpoint/StudentEndPoint.java          | 39 [32m++++++++[m[31m----[m
 .../springBoot/awesome/error/CustomErrorType.java  | 14 [32m+++++[m
 .../com/springBoot/awesome/error/package-info.java |  1 [32m+[m
 .../br/com/springBoot/awesome/model/Student.java   | 70 [32m++++++++++++++++++++[m[31m--[m
 .../br/com/springBoot/awesome/util/DateUtil.java   |  2 [31m-[m
 6 files changed, 106 insertions(+), 21 deletions(-)

[33mcommit 7b35bab838665e1a4d65a9018946f941624f4297[m
Author: Elen Nascimento <luanoliveira1107@gmail.com>
Date:   Mon Jun 15 23:06:57 2020 -0300

    Adicionado pacote Util e a classe DateUtil, para apresentar a data e hora atual.

 .project                                           |  11 [32m+[m
 demo/.gitignore                                    |  31 [32m+++[m
 demo/.mvn/wrapper/MavenWrapperDownloader.java      | 117 [32m++++++++[m
 demo/.mvn/wrapper/maven-wrapper.jar                | Bin [31m0[m -> [32m50710[m bytes
 demo/.mvn/wrapper/maven-wrapper.properties         |   2 [32m+[m
 demo/mvnw                                          | 310 [32m+++++++++++++++++++++[m
 demo/mvnw.cmd                                      | 182 [32m++++++++++++[m
 demo/pom.xml                                       |  49 [32m++++[m
 .../br/com/springBoot/awesome/DemoApplication.java |  14 [32m+[m
 .../awesome/endpoint/StudentEndPoint.java          |  32 [32m+++[m
 .../br/com/springBoot/awesome/model/Student.java   |  18 [32m++[m
 .../br/com/springBoot/awesome/util/DateUtil.java   |  23 [32m++[m
 demo/src/main/resources/application.properties     |   2 [32m+[m
 .../br/com/springBoot/DemoApplicationTests.java    |  13 [32m+[m
 14 files changed, 804 insertions(+)

[33mcommit 1e1829f096c0f00f63ef22054f1e7ea1b700d83a[m
Author: Luan Nascimento Oliveira <luanoliveira1107@gmail.com>
Date:   Mon Jun 15 22:59:58 2020 -0300

    Initial commit

 README.md | 1 [32m+[m
 1 file changed, 1 insertion(+)
