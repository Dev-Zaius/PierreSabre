" VIM Configuration File
" " Description: Optimized for C/C++ development, but useful also for other
" things.
" " Author: Gerhard Gappmeier
" "
"
set nocompatible
filetype off
set rtp+=~/.vim/bundle/Vundle.vim

call vundle#begin()

Plugin 'VundleVim/Vundle.vim'
Plugin 'tpope/vim-fugitive'
Plugin 'git://git.wincent.com/command-t.git'
Plugin 'file:///home/gmarik/path/to/plugin'
Plugin 'rstacruz/sparkup', {'rtp': 'vim/'}
Plugin 'ascenator/L9', {'name': 'newL9'}
Plugin 'dhruvasagar/vim-table-mode'
Plugin 'ycm-core/YouCompleteMe'
Plugin 'octol/vim-cpp-enhanced-highlight'
Plugin 'conornewton/vim-pandoc-markdown-preview'

call vundle#end()

" C higlight
let g:cpp_posix_standard = 1
let g:cpp_class_scope_highlight = 1
let g:cpp_member_variable_highlight = 1
" Operator Higlight
let g:ophigh_color = 208 

"Markdown pdf preview
let g:md_pdf_viewer="zathura"
let g:md_args = "--template eisvogel --listings --number-sections"
"Markdown table mode corner
let g:table_mode_corner='|'

filetype plugin indent on
" set UTF-8 encoding
set enc=utf-8
set fenc=utf-8
set termencoding=utf-8
let mapleader = ','
nnoremap <leader>a <C-a>
nnoremap <leader>x <C-x>
nnoremap <leader>p :StartMdPreview<CR>
inoremap { {}<Esc>ha
inoremap ( ()<Esc>ha
inoremap [ []<Esc>ha
inoremap < <><Esc>ha
inoremap " ""<Esc>ha
inoremap ` ``<Esc>ha

nnoremap k gk
nnoremap j gj

xnoremap <Tab> >gv
xnoremap <S-Tab> <gv

autocmd VimEnter * hi Normal guibg=NONE ctermbg=NONE 
autocmd VimEnter * hi clear LineNr
autocmd! ColorScheme * hi clear LineNr
autocmd! ColorScheme * hi CursorLineNr cterm=bold ctermfg=green
" disable vi compatibility (emulation of old bugs)
set nocompatible
" use indentation of previous line
set autoindent
" use intelligent indentation for C
set smartindent
" configure tabwidth and insert spaces instead of tabs
set tabstop=4        " tab width is 4 spaces
set shiftwidth=4     " indent also with 4 spaces
""set expandtab        " expand tabs to spaces
" wrap lines at 120 chars. 80 is somewaht antiquated with nowadays displays.
set textwidth=120
" turn syntax highlighting on
set t_Co=256
syntax on
colorscheme onehalfdark
set cursorline
"turn line numbers on
set number
" highlight matching braces
set showmatch
" intelligent comments
"set comments=sl:/*,mb:\ *,elx:\ */

" This offers intelligent C++ completion when typing ‘.’ ‘->’ or <C-o>
" Load standard tag files
set tags+=~/.vim/tags/cpp
set tags+=~/.vim/tags/gl
set tags+=~/.vim/tags/sdl
set tags+=~/.vim/tags/qt4

" Install DoxygenToolkit from
let g:DoxygenToolkit_authorName="John Doe <john@doe.com>"

" Enhanced keyboard mappings
"
" in normal mode F2 will save the file
nmap <F2> :w<CR>
" in insert mode F2 will exit insert, save, enters insert again
imap <F2> <ESC>:w<CR>i
" switch between header/source with F4
map <F4> :e %:p:s,.h$,.X123X,:s,.cpp$,.h,:s,.X123X$,.cpp,<CR>
" recreate tags file with F5
map <F5> :!ctags -R –c++-kinds=+p –fields=+iaS –extra=+q .<CR>
" create doxygen comment
map <F6> :Dox<CR>
" build using makeprg with <F7>
map <F7> :make<CR>
" build using makeprg with <S-F7>
map <S-F7> :make clean all<CR>
" goto definition with F12
map <F12> <C-]>
" in diff mode we use the spell check keys for merging
if &diff
  ” diff settings
  map <M-Down> ]c
  map <M-Up> [c
  map <M-Left> do
  map <M-Right> dp
  map <F9> :new<CR>:read !svn diff<CR>:set syntax=diff buftype=nofile<CR>gg
else
  " spell settings
  "setlocal spell spelllang=en
  " set the spellfile - folders must exist
  set spellfile=~/.vim/spellfile.add
  map <M-Down> ]s
  map <M-Up> [s
  endif
