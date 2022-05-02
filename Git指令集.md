# Git指令集

## 1. 安装设置 自爆家门，因为你是分布式的  

git config --global user.name "youname"       

git config --global user.eemail "youremail"

## 2. 新建目录 

mkdir learngit

## 3. 查看目录

pwd

## 4.打开目录

cd learngit

## 5.将一个目录设置成一个Repository

git init

前提是要切换到目标目录之下，然后执行此指令

## 6.git 支持多添加，一次性可以多提交文件

git add readme.txt

git commit  -m "对本次提交进行说明解释"

第一步是用`git add`把文件添加进去，实际上就是把文件修改添加到暂存区；

第二步是用`git commit`提交更改，实际上就是把暂存区的所有内容提交到当前分支。

## 7.了解仓库的当前状态

git status 

## 8.查看修改的内容

git diff readme.txt

## 9.查看提交的历史

git log

git log  --pretty=oneline

## 10.回退版本

git reset --hard HERA^

首先，Git必须知道当前版本是哪个版本，在Git中，用`HEAD`表示当前版本，也就是最新的提交`1094adb...`（注意我的提交ID和你的肯定不一样），上一个版本就是`HEAD^`，上上一个版本就是`HEAD^^`，当然往上100个版本写100个`^`比较容易数不过来，所以写成`HEAD~100`。

## 11.记录你的每一次命令

git reflog

## 12.几种回退

场景1：当你改乱了工作区某个文件的内容，想直接丢弃工作区的修改时，用命令`git checkout -- file`。

场景2：当你不但改乱了工作区某个文件的内容，还添加到了暂存区时，想丢弃修改，分两步，第一步用命令`git reset HEAD <file>`，就回到了场景1，第二步按场景1操作。

场景3：已经提交了不合适的修改到版本库时，想要撤销本次提交，参考[版本回退](https://www.liaoxuefeng.com/wiki/896043488029600/897013573512192)一节，不过前提是没有推送到远程库。

## 13.删除 工作区的文件

```git
$ rm test.txt
git rm test.txt
git commit -m "remove test.txt"
```

## 14.创建SSHkey

```git
ssh-keygen -t rsa -C "youremail@example.com"
```

## 15.创建分支

git checkout -b dev

`git checkout`命令加上`-b`参数表示创建并切换，

```git
$ git switch -c dev
 git switch main
```

## 16.查看当前分支

git branch

## 17.合并分支，切换分支，删除分支

git merge dev

git checkout main

git branch -d dev