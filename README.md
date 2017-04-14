# OreForge
Minecraft Mod that Reworks the Way Crafting Tools and Equipment Works

# Progress/Todo
Completed Gradle Forge build importing, as well as .gitignore. We need Lisence, and other documentation like that completed now.

Things to work on:
* Functioning Creative Tab
* Add some fancy features such as the OreForge and the Crucible, even if they don't do anything yet
* Figure Out how to do complex things outside of Guis

# To Contribute:
To complete these steps, you will need the OpenJDK 8, Eclipse or IntelliJ IDEA, Gradle, and Git.

1. Create a fork of this repository.

2. Clone your fork to your machine, in your workspace (use <code>git clone [url to your forked repo]</code>, after navigating to your workspace directory in the command line using <code>cd</code>).

3. Navigate to the repository directory (using <code>cd</code>, you should just have to type <code>cd OreForge</code>).

4. Run <code>./gradlew setupDecompWorkspace</code> Then run <code>./gradlew eclipse</code>. (You can run the commands all at once by combining them like this: <code>./gradlew setupDecompWorkspace eclipse</code>) (on Windows, remove the ./ from the command) (If you're using IntelliJ IDEA, replace the <code>eclipse</code> with <code>IDEA</code>) These commands set up the gradle environment so that it is possible to keep a build record.

5. Open up your IDE and configure it to recognize your project folder.

# Pushing Changes to Github *Needs Work
1. Before you start editing your local clone, make sure that your fork is up to date with this repo by opening a PR on *your* fork. Then run <code>git pull</code> in your OreForge directory. This updates your local clone to the current state of your fork.
2. Edit! Add to the mod however you'd like. We'll see if we want your changes. If they are changes that we would like to see in the mod, or a fix for something we can't get to work, we'll be more likely to accept your pull request.
3. Once you've done everything you want to, you need to commit your changes to your local clone, so they can be pushed to your fork. Before we do this, we want to see exactly what we are going to be commiting. To see this, navigate to your repository/workspace in a terminal (Should be called OreForge), and run <code>git status</code>. This will print out a bunch of info, such as files that are staged for the commit, untracked files, and files that you've edited but haven't staged.
4. In general, you can just run <code>git commit -a -m 'commit message, keep it breif, but describe what you did with a degree of accuracy'</code> (-a means to add files that were changed automatically, and -m allows you to put your commit message in the command instead of opening nano or something else). However, (although this shouldn't happen, it might, so use git status before you commit to see your changes) you don't want any files that eclipse or gradle might have generated to sneak into that commit.
5. This repository includes a .gitignore file (file that tells git what folders not to include in anything) that had most of the things your programs will generate. However, there might be some things that aren't in that file, and need to be added. For example, this source code hasn't been used with IntelliJ yet, so any files created by or for that program aren't included in .gitignore, so if you're using IntelliJ, there will be more work. <code>git status</code> should tell us if there are any untracked files in your working directory. Basically, if you don't remember editing the fiHowever, for now, we want to make sure we haven't created any files by accident that we don't want included in your commit. Usually it's OK to run the above command, it won't include tracked files unless you tell it to. However, to make life cleaner in the future, you want to add these files to your .gitignore. Basically, if you don't remember editing the file, or it isn't in this repository, then it probably shouldn't go in your commit. If there are any files of this type, then add them to the .gitignore file, which should be found in your OreForge folder (you probably need to set your file manager to show hidden files, since it begins with a .). Open the file with a text editor, and add any files that fit the above criteria to the file (start each line with a /).
6. If you run <code>git status</code> again, you should see that those files have disappeared. This is good. Use <code>git add 'path/to/filename'</code> to add any other source code files that you created while working to the repository. Then you can run <code>git commit -a -m 'commit message, keep it breif, but describe what you did with a degree of accuracy'</code> to commit your changes to the repository. You can split up your work into multiple commits if you like, but you only want to push your changes once, and open one pull request.
7. In order to make your commit appear in your Github fork, you need to run <code>git push</code>. It will ask you for your Github username and password, or possibly promt you to edit a file or run a command (Run/edit this before you try to run <code>git push</code> again). After you have entered that info, it should spit out a few things, and then give you back your prompt.
8. Now you go over to github (This section is all in theory, sorry), and navigate either to this repository, or you fork (again, sorry, I don't know this for sure). There should be a button that says "New Pull Request". Press it, fill in the info, and submit. If we like your edits, we'll add them. If no, we'll talk about them, and you'll do all these steps over again. :P
