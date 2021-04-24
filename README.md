# Music Visualiser Project

Name: Ross McElhinney

Student Number: C19430472

# Description of the assignment

My assignment creates visual animations that responds to music. There are a total of
7 animations, which can be switched between by hitting any of the 1-7 keys.

# Instructions

To start the music, hit space.
To toggle different animations, hit any of the 1-7 keys.

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

# Markdown Tutorial

This is _emphasis_

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings

## Headings

#### Headings

##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1  | Heading 2                      |
| ---------- | ------------------------------ |
| Some stuff | Some more stuff in this column |
| Some stuff | Some more stuff in this column |
| Some stuff | Some more stuff in this column |
| Some stuff | Some more stuff in this column |
