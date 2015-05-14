Finite Torches
===================
[TOC]

---
##Doc help
```flow
st=>start: Using this mod
e1=>end: Grab the universal download
e2=>end: Grab the universal download and read the wiki
e3=>end: Checkout the repository
e4=>end: I can't really help you

dev=>condition: Are you a developer?
admin=>condition: Are you a server admin?
player=>condition: Are you a player?


st->dev
dev(yes)->e3
dev(no)->admin
admin(yes)->e2
admin(no)->player
player(yes)->e1
player(no)->e4
```
---
##Developer help

 - Checkout the repo
 - Refer to [this](http://www.minecraftforge.net/forum/index.php?topic=14048.0) forum post for Forge setup
 - Feel free to submit a pull request with whatever you add/change!

---
##Server admin help
This mod was built with a server in mind so it should work in most environments.
If you encounter any problems, please submit an issue and I'll get back to you asap!

---