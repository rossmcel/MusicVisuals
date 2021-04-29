# Music Visualiser Project

Name: Ross McElhinney

Student Number: C19430472

Youtube Video Demonstration:
[![YouTube](http://img.youtube.com/vi/uRYmBVHBL6I/0.jpg)](https://www.youtube.com/watch?v=uRYmBVHBL6I)

# Description of the assignment

My assignment creates visual animations that responds to music. There are a total of
7 animations, which can be switched between by hitting any of the 1-7 keys.

# Instructions

To start the music, hit space.
To toggle different animations, hit any of the 1-7 keys.

### Animation List

| Key | Visual Name                             |
| --- | --------------------------------------- |
| 1   | Rotating Squares                        |
| 2   | Expanding Circle Beats                  |
| 3   | Tile Stairs                             |
| 4   | Crazy Squares                           |
| 5   | Rotating Line and Squares Coloured      |
| 6   | Rotating Line and Squares Mono-Coloured |
| 7   | Alive Boxes                             |

# How it works

The animation is controlled in the 'MyVisual' class, where individual animations
are called from. These animations are divided into their own classes.
'MyVisual' is ultimately the 'brain' of the project, since it controls timing and
responds to user input.
Each animation's properties are influenced by the inputted music itself, which outputs a
dynamic series of movements, shape changes and colours.

# What I am most proud of in the assignment

I am very proud of the abstract artistic animations that result from different changes to
the music in this project. I enjoy the fundamental discipline and logic of these animations while also
appreciating the freedom they have to create what appears as independent responses to music.

Such an example is the 'Alive Boxes' visual, which appears almost conscious in its movemements.
![Example](images/independentAnimation.png)

Another example is the 'Expanding Circle Beats' visual, which contains an individual visual element
for each and every beat, providing a satisfying visual reflection on the flow and dynamism of the music.
![Example](images/CircleBeats.png)
