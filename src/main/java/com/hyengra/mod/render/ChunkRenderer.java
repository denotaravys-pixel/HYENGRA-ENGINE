package com.hyengra.mod.render;

import org.lwjgl.opengl.GL11;

public class ChunkRenderer {

    public static void render() {
        GL11.glEnable(GL11.GL_DEPTH_TEST);

        GL11.glBegin(GL11.GL_QUADS);

        GL11.glColor3f(1f, 0f, 0f);

        GL11.glVertex3f(0, 0, 0);
        GL11.glVertex3f(1, 0, 0);
        GL11.glVertex3f(1, 1, 0);
        GL11.glVertex3f(0, 1, 0);

        GL11.glEnd();
    }
}
