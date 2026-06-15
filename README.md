# CowsayPlugin

CowsayPlugin is a lightweight Paper Minecraft plugin that recreates the classic Linux `cowsay` command inside the game. It allows players to display custom messages in a speech bubble above an ASCII cow.

---

## Overview

This plugin adds a simple `/cowsay` command. Messages are displayed in a speech bubble followed by an ASCII cow. The plugin also supports a global broadcast mode controlled by operators.

---

## Features

- `/cowsay <message>` command
- `/cowsay globalToggle` (OP-only or permission-based)
- Global broadcast mode (all players see cowsay messages)
- Persistent settings (saved across server restarts)
- Dynamic ASCII speech bubble
- Classic cow ASCII art output
- Tab completion support
- Lightweight and fast
- No dependencies

---

## Requirements

- Paper server
- Minecraft 1.20+ (Paper API compatible)
- Java 17 or higher

---

## Installation

Download the latest `.jar` from Releases, place it in your `plugins` folder, and restart your server.

On first run, the plugin will generate a `config.yml` file automatically.

---

## Commands

### `/cowsay <message>`

Displays a message in a speech bubble above a cow.

**Example:**

/cowsay hello world

**Output:**

```
 _______________
< hello world >
 ---------------
        \   ^__^
         \  (oo)\_______
            (__)\       )\/\
                ||----w |
                ||     ||
```

---

### `/cowsay globalToggle`

Toggles global broadcast mode.

- When enabled: all players see cowsay messages
- When disabled: only the sender sees their message
- Requires OP or `cowsay.globaltoggle` permission

---

## Persistence

The global toggle setting is saved in:

```
globalToggle: false
```

This ensures the setting stays active even after server restarts.

---

## Permissions

| Permission | Description |
|------------|-------------|
| `cowsay.globaltoggle` | Allows toggling global broadcast mode |

---

## About

CowsayPlugin is inspired by the Linux `cowsay` utility and brings it into Minecraft as a fun command-based feature with multiplayer support.

---

## License

This project is licensed under the MIT License.

---

## Author

RensJAM
